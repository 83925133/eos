/**
 * Copyright (c) 2005-2012 springside.org.cn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.whale.eos.basic.util.security.utils;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

import com.whale.eos.basic.util.Exceptions;


/**
 * 支持HMAC-SHA1消息签名 及 DES/AES对称加密的工具类.
 * <p/>
 * 支持Hex与Base64两种编码方式.
 *
 * @author calvin
 */
public class Cryptos {

    private static final String AES = "AES";
    private static final String DES = "DES";
    private static final String HmacMD5 = "HmacMD5";
    private static final String AES_ECB = "AES/ECB/PKCS5Padding";
    private static final String HMACSHA1 = "HmacSHA1";
    private static final String DESede = "DESede/ECB/PKCS5Padding"; //定义加密算法,可用 DES,DESede,Blowfish

    private static final int DEFAULT_HMACSHA1_KEYSIZE = 160; //RFC2401
    private static final int DEFAULT_AES_KEYSIZE = 128;

    private static final String ENCODE = "UTF-8";

    //-- HMAC-SHA1 funciton --//

    /**
     * 使用HMAC-SHA1进行消息签名, 返回字节数组,长度为20字节.
     *
     * @param input 原始输入字符数组
     * @param key   HMAC-SHA1密钥
     */
    public static byte[] hmacSha1(byte[] input, byte[] key) {
        try {
            SecretKey secretKey = new SecretKeySpec(key, HMACSHA1);
            Mac mac = Mac.getInstance(HMACSHA1);
            mac.init(secretKey);
            return mac.doFinal(input);
        } catch (GeneralSecurityException e) {
            throw Exceptions.unchecked(e);
        }
    }


    /**
     * @param input 原始输入字符数组
     * @param key   密钥
     */
    public static byte[] hmacMD5Encode(byte[] input, byte[] key) {
        try {
            SecretKey secretKey = new SecretKeySpec(key, HmacMD5);
            Mac mac = Mac.getInstance(HmacMD5);
            mac.init(secretKey);
            return mac.doFinal(input);
        } catch (GeneralSecurityException e) {
            throw Exceptions.unchecked(e);
        }
    }

    /**
     * 校验HMAC-SHA1签名是否正确.
     *
     * @param expected 已存在的签名
     * @param input    原始输入字符串
     * @param key      密钥
     */
    public static boolean isMacValid(byte[] expected, byte[] input, byte[] key) {
        byte[] actual = hmacSha1(input, key);
        return Arrays.equals(expected, actual);
    }

    /**
     * 生成HMAC-SHA1密钥,返回字节数组,长度为160位(20字节).
     * HMAC-SHA1算法对密钥无特殊要求, RFC2401建议最少长度为160位(20字节).
     */
    public static byte[] generateHmacSha1Key() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(HMACSHA1);
            keyGenerator.init(DEFAULT_HMACSHA1_KEYSIZE);
            SecretKey secretKey = keyGenerator.generateKey();
            return secretKey.getEncoded();
        } catch (GeneralSecurityException e) {
            throw Exceptions.unchecked(e);
        }
    }

    //-- AES funciton --//

    /**
     * 使用AES加密原始字符串.
     *
     * @param source 原始输入字符串
     * @param key    符合AES要求的密钥
     */
    public static String aesEncryptWith128AndHex(String source, byte[] key) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
            //解决linux与windows下算法密钥生成不一直问题
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(key);

            keyGenerator.init(DEFAULT_AES_KEYSIZE, secureRandom);
            SecretKey secretKey = keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance(AES_ECB);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] encryptData = cipher.doFinal(source.getBytes(ENCODE));

            return bytesToHexString(encryptData);
        } catch (Exception e) {
            throw Exceptions.unchecked(e);
        }
    }

    /**
     * 使用AES加密原始字符串.
     *
     * @param input 原始输入字符数组
     * @param key   符合AES要求的密钥
     */
    public static byte[] aesEncrypt(byte[] input, byte[] key) {
        return aes(input, key, Cipher.ENCRYPT_MODE);
    }

    /**
     * 使用AES解密字符串, 返回原始字符串.
     *
     * @param soruce 加密字符串
     * @param key    符合AES要求的密钥
     */
    public static String aesDecryptWith128AndHex(String soruce, byte[] key) {
        try {
            byte[] hexData = hexStringToBytes(soruce);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
            //解决linux与windows下算法密钥生成不一直问题
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(key);

            keyGenerator.init(DEFAULT_AES_KEYSIZE, secureRandom);
            SecretKey secretKey = keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance(AES_ECB);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            return new String(cipher.doFinal(hexData));
        } catch (Exception e) {
            throw Exceptions.unchecked(e);
        }
    }

    /**
     * 使用AES解密字符串, 返回原始字符串.
     *
     * @param input Hex编码的加密字符串
     * @param key   符合AES要求的密钥
     */
    public static String aesDecrypt(byte[] input, byte[] key) {
        byte[] decryptResult = aes(input, key, Cipher.DECRYPT_MODE);
        return new String(decryptResult);
    }


    /**
     * 使用AES加密或解密无编码的原始字节数组, 返回无编码的字节数组结果.
     *
     * @param input 原始字节数组
     * @param key   符合AES要求的密钥
     * @param mode  Cipher.ENCRYPT_MODE 或 Cipher.DECRYPT_MODE
     */
    private static byte[] aes(byte[] input, byte[] key, int mode) {
        try {
            SecretKey secretKey = new SecretKeySpec(key, AES);
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(mode, secretKey);
            return cipher.doFinal(input);
        } catch (GeneralSecurityException e) {
            throw Exceptions.unchecked(e);
        }
    }

    /**
     * 生成AES密钥,返回字节数组, 默认长度为128位(16字节).
     */
    public static byte[] generateAesKey() {
        return generateAesKey(DEFAULT_AES_KEYSIZE);
    }

    /**
     * 生成AES密钥,可选长度为128,192,256位.
     */
    public static byte[] generateAesKey(int keysize) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
            keyGenerator.init(keysize);
            SecretKey secretKey = keyGenerator.generateKey();
            return secretKey.getEncoded();
        } catch (GeneralSecurityException e) {
            throw Exceptions.unchecked(e);
        }
    }

    /**
     * 生成AES密钥,可选长度为128,192,256位.
     */
    public static byte[] generateAesKeyWith128(String key) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
            keyGenerator.init(DEFAULT_AES_KEYSIZE, new SecureRandom(key.getBytes()));
            SecretKey secretKey = keyGenerator.generateKey();
            return secretKey.getEncoded();
        } catch (GeneralSecurityException e) {
            throw Exceptions.unchecked(e);
        }
    }


    /**
     * 加密
     *
     * @param src 数据源
     * @param key 密钥，长度必须是8的倍数
     * @return 返回加密后的数据
     * @throws Exception
     */
    public static byte[] desEncrypt(byte[] src, byte[] key) throws Exception {
        //DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();
        // 从原始密匙数据创建DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key);
        // 创建一个密匙工厂，然后用它把DESKeySpec转换成
        // 一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);
        // Cipher对象实际完成加密操作
        Cipher cipher = Cipher.getInstance(DES);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
        // 现在，获取数据并加密
        // 正式执行加密操作
        return cipher.doFinal(src);
    }

    /**
     * 解密
     *
     * @param src 数据源
     * @param key 密钥，长度必须是8的倍数
     * @return 返回解密后的原始数据
     * @throws Exception
     */
    public static byte[] desDecrypt(byte[] src, byte[] key) throws Exception {
        // DES算法要求有一个可信任的随机数源
        SecureRandom sr = new SecureRandom();
        // 从原始密匙数据创建一个DESKeySpec对象
        DESKeySpec dks = new DESKeySpec(key);
        // 创建一个密匙工厂，然后用它把DESKeySpec对象转换成
        // 一个SecretKey对象
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);
        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance(DES);
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, sr);
        // 现在，获取数据并解密
        // 正式执行解密操作
        return cipher.doFinal(src);
    }

    public static String encrypt3desWithHex(String src, byte[] keybyte){
        try {
            //字符串编码默认以操作系统默认编码格式进行编码，所以要显示指定编码方式
            return bytesToHexString(encrypt3des(keybyte, src.getBytes("utf-8")));
        } catch (Exception e) {
            throw Exceptions.unchecked(e);
        }
    }

    public static String dencrypt3desWithHex(String src, byte[] keybyte) throws Exception {
        byte[] hexData = hexStringToBytes(src);
        return new String(decrypt3des(keybyte, hexData),"utf-8");
    }

    //keybyte为加密密钥，长度为24字节
    //src为被加密的数据缓冲区（源）
    public static byte[] encrypt3des(byte[] keybyte, byte[] src) throws Exception {
        //生成密钥
        SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
        //加密
        Cipher c1 = Cipher.getInstance(DESede);
        c1.init(Cipher.ENCRYPT_MODE, deskey);
        return c1.doFinal(src);//在单一方面的加密或解密
    }


    //keybyte为加密密钥，长度为24字节
    //src为加密后的缓冲区
    public static byte[] decrypt3des(byte[] keybyte, byte[] src) throws Exception {
        //生成密钥
        SecretKey deskey = new SecretKeySpec(keybyte, "DESede");
        //解密
        Cipher c1 = Cipher.getInstance(DESede);
        c1.init(Cipher.DECRYPT_MODE, deskey);
        return c1.doFinal(src);
    }

    /**
     * Convert byte［］ to hex string.这里我们可以将byte转换成int，然后利用Integer.toHexString（int）来转换成16进制字符串。
     *
     * @param src byte［］ data
     * @return hex string
     */

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        int length = src.length;
        for (int i = 0; i < length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * Convert hex string to byte[]
     *
     * @param hexString the hex string
     * @return byte[]
     */

    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    /**
     * Convert char to byte
     *
     * @param c char
     * @return byte
     */

    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }
}