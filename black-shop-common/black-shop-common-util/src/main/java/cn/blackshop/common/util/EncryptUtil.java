/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.common.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI;
import org.springframework.util.StringUtils;

/**
 * 加密类
 * @author zibin
 *
 */
public class EncryptUtil {

	 /**
     * 制表符、空格、换行符 PATTERN
     */
    private static Pattern BLANK_PATTERN = Pattern.compile("\\s*|\t|\r|\n");

    /**
     * 可以理解为加密salt
     */
    private static String PASSWORD = "black-shop";

    /**
     * 加密算法
     */
    private static String ALGORITHM = "PBEWithMD5AndDES";

    /**
     * Gets the encrypted params.
     *
     * @param input the input
     * @return the encrypted params
     */
    public static Map<String,String> getEncryptedParams(String input) {
        //输出流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        PrintStream cacheStream = new PrintStream(byteArrayOutputStream);
        //更换数据输出位置
        System.setOut(cacheStream);

        //加密参数组装
        String[] args = {"input=" + input, "password=" + PASSWORD, "algorithm=" + ALGORITHM};
        JasyptPBEStringEncryptionCLI.main(args);

        //执行加密后的输出
        String message = byteArrayOutputStream.toString();
        String str = replaceBlank(message);
        int index = str.lastIndexOf("-");

        //返回加密后的数据
        Map<String,String> result = new HashMap<String,String>();
        result.put("input", str.substring(index + 1));
        result.put("password", PASSWORD);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getEncryptedParams("root"));//print : {input=Ore69lUopDHL5R8Bw/G3bQ==, password=klklklklklklklkl}
    }

    /**
     * 替换制表符、空格、换行符
     *
     * @param str	
     * @return
     */
    private static String replaceBlank(String str) {
        String dest = "";
        if (!StringUtils.isEmpty(str)) {
            Matcher matcher = BLANK_PATTERN.matcher(str);
            dest = matcher.replaceAll("");
        }
        return dest;
    }
}
