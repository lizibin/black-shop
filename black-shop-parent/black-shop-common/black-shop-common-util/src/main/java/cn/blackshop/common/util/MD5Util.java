package cn.blackshop.common.util;

import java.security.MessageDigest;

/**

* <p>Title: MD5Util</p>  

* <p>Description: md5加密工具类，带盐值</p>  

* @author zibin  

* @date 2018年12月11日
 */
public class MD5Util {

	public static String encode(String password,String salt) {
		password = password + salt;
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		char[] charArray = password.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++)
			byteArray[i] = (byte) charArray[i];
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16) {
				hexValue.append("0");
			}

			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(MD5Util.encode("123456","blackshop"));

	}
}