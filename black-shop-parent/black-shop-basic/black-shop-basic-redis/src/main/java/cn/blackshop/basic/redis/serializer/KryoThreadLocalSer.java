package cn.blackshop.basic.redis.serializer;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import de.javakaffee.kryoserializers.*;
import de.javakaffee.kryoserializers.cglib.CGLibProxySerializer;

import java.lang.reflect.InvocationHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;

public class KryoThreadLocalSer {

    private KryoThreadLocalSer() {
    }

    public static KryoThreadLocalSer getInstance() {
        return Singleton.kryoThreadLocal;
    }

    public byte[] ObjSerialize(Object obj) {
        try {
            if(obj == null){
                System.out.println("ObjSerialize null object");
                return null;
            }
            KryoHolder kryoHolder = kryoThreadLocal.get();
            kryoHolder.output.clear();  // 每次调用的时候  重置
            kryoHolder.kryo.writeClassAndObject(kryoHolder.output, obj);
            return kryoHolder.output.toBytes();// 无法避免拷贝  ~~~
        } finally {
            obj = null;
        }

    }


    public Object ObjDeserialize(byte[] bytes) {
        try {
            if(bytes == null){
                System.out.println("ObjDeserialize null object");
                return null;
            }
            KryoHolder kryoHolder = kryoThreadLocal.get();
            kryoHolder.input.setBuffer(bytes, 0, bytes.length);//call it ,and then use input object  ,discard any array
            return kryoHolder.kryo.readClassAndObject(kryoHolder.input);
        } finally {
            bytes = null;       //  for gc
        }

    }

    /**
     * 创建单例
     */
    private static class Singleton {
        private static final KryoThreadLocalSer kryoThreadLocal = new KryoThreadLocalSer();
    }

    private final ThreadLocal<KryoHolder> kryoThreadLocal = new ThreadLocal<KryoHolder>() {
        @Override
        protected KryoHolder initialValue() {
            return new KryoHolder(new Kryo());
        }
    };


    private class KryoHolder {

        /** The kryo. */
        private Kryo kryo;

        /** The Constant BUFFER_SIZE. */
        static final int BUFFER_SIZE = 1024;

        /** The output. */
        private Output output = new Output(BUFFER_SIZE, -1);     //reuse

        /** The input. */
        private Input input = new Input();

        /**
         * The Constructor.
         *
         * @param kryo the kryo
         */
        KryoHolder(Kryo kryo) {
            this.kryo = kryo;
            this.kryo.setReferences(true);//针对有嵌套关系的类，需要设置为true，默认为true

            //   register
            this.kryo.register(Arrays.asList("").getClass(), new ArraysAsListSerializer());
            this.kryo.register(Collections.EMPTY_LIST.getClass(), new CollectionsEmptyListSerializer());
            this.kryo.register(Collections.EMPTY_MAP.getClass(), new CollectionsEmptyMapSerializer());
            this.kryo.register(Collections.EMPTY_SET.getClass(), new CollectionsEmptySetSerializer());
            this.kryo.register(Collections.singletonList("").getClass(), new CollectionsSingletonListSerializer());
            this.kryo.register(Collections.singleton("").getClass(), new CollectionsSingletonSetSerializer());
            this.kryo.register(Collections.singletonMap("", "").getClass(), new CollectionsSingletonMapSerializer());
            this.kryo.register(GregorianCalendar.class, new GregorianCalendarSerializer());
            this.kryo.register(InvocationHandler.class, new JdkProxySerializer());

            // register CGLibProxySerializer, works in combination with the appropriate action in handleUnregisteredClass (see below)
            this.kryo.register(CGLibProxySerializer.CGLibProxyMarker.class, new CGLibProxySerializer());
            UnmodifiableCollectionsSerializer.registerSerializers(this.kryo);
            SynchronizedCollectionsSerializer.registerSerializers(this.kryo);

        }

    }

}
