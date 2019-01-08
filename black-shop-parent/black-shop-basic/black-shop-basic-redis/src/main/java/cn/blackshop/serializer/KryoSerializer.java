package cn.blackshop.serializer;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * Kryo序列化
 */
public class KryoSerializer implements RedisSerializer<Object> {

    @Override
    public byte[] serialize(Object obj) throws SerializationException {
        return KryoThreadLocalSer.getInstance().ObjSerialize(obj);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        return KryoThreadLocalSer.getInstance().ObjDeserialize(bytes);
    }
}
