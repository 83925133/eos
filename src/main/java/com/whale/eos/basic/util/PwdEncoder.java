package com.whale.eos.basic.util;

import java.security.MessageDigest;

/**
 * Created by IntelliJ IDEA.
 * User: swen
 * Date: 11-12-9
 * Time: 下午4:37
 * To change this template use File | Settings | File Templates.
 */
public class PwdEncoder {

    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    private Object salt;
    private String algorithm;

    public PwdEncoder(Object salt, String algorithm) {
        this.salt = salt;
        this.algorithm = algorithm;
    }

    public String encode(String rawPass) {
        String result = null;
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            //加密后的字符串
            result = byteArrayToHexString(md.digest(mergePasswordAndSalt(rawPass).getBytes("utf-8")));
        } catch (Exception ex) {
        }
        return result;
    }

    public boolean isPasswordValid(String encPass, String rawPass) {
        String pass1 = "" + encPass;
        String pass2 = encode(rawPass);

        return pass1.equals(pass2);
    }

    private String mergePasswordAndSalt(String password) {
        if (password == null) {
            password = "";
        }

        if ((salt == null) || "".equals(salt)) {
            return password;
        } else {
            return password + /*"{" +*/ salt.toString() /*+ "}"*/;
        }
    }

    /**
     * 转换字节数组为16进制字串
     *
     * @param b 字节数组
     * @return 16进制字串
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        int length = b.length;
        for (int i = 0; i < length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
    public static final String HASH_ALGORITHM = "SHA-1";
    public static final int HASH_INTERATIONS = 1024;
    //private static final int SALT_SIZE = 8;
    /**
     * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
   /* public static String entryptPassword(Operator operator) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        operator.setPwdSalt(Encodes.encodeHex(salt));

        byte[] hashPassword = Digests.sha1(operator.getPlainPassword().getBytes(), salt, HASH_INTERATIONS);
        operator.setLoginPwd(Encodes.encodeHex(hashPassword));
        return Encodes.encodeHex(hashPassword);
    }

    public static String entryptPassword(String pwd, String salt) {
        byte[] hashPassword = Digests.sha1(pwd.getBytes(), Encodes.decodeHex(salt), HASH_INTERATIONS);
        return Encodes.encodeHex(hashPassword);
    }*/

    public static void main(String[] args) {
    	//Operator operator = new Operator();
    	//operator.setPlainPassword("test");
    	//String pass2 = "test";
    	/*byte[] salt = Digests.generateSalt(SALT_SIZE);
    	String pwd = entryptPassword(pass2, Encodes.encodeHex(salt));*/
    	//System.out.println(entryptPassword(operator));
    	
	}
}
