package com.jnshu.Util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//import java.security.MessageDigest;
//
///**
// * Created by 56929 on 2017/5/4.
// */
//public class MD5Util {
//    private static final String encryModel="MD5";
//    public static String md5(String str){
//        return encrypt(encryModel,str);
//    }
//    public static String encrypt(String algorithm,String str){
//        try {
//            MessageDigest md = MessageDigest.getInstance(algorithm);
//            md.update(str.getBytes());
//            StringBuffer sb = new StringBuffer();
//            byte[] bytes = md.digest();
//            for (int i = 0;i < bytes.length;i++){
//                int b = bytes[i]& 0xFF;
//                if (b< 0x10) {
//                    sb.append('0');
//                }
//                sb.append(Integer.toHexString(b));
//            }
//            return sb.toString();
//        }catch (Exception e){
//            return  "";
//        }
//    }
//}
//public class MD5Util {
//    public static String stringToMD5(String string) {
//        MessageDigest md = null;
//        try {
//            md = MessageDigest.getInstance("MD5");
//        } catch (NoSuchAlgorithmException e){
//            e.printStackTrace();
//        }
//        //计算md5函数
//        md.update(string.getBytes());
//        //digest()最后确定返回md5 hash值
//        //Biginteger函数则将8位的字符串转换成16位的hex值,用字符串表示;得到字符串形式的hash值
//        return new BigInteger(1,md.digest()).toString(16);
//    }
//    public static String gengerate(String password) {
//        Random r = new Random();
//        StringBuilder sb = new StringBuilder(16);
//        sb.append(r.nextInt(99999999)).append(r.nextInt(99999999));
//        int len = sb.length();
//        if (len<16) {
//            for (int i = 0;i<16-len;i++){
//                sb.append("0");
//            }
//        }
//        String salt = sb.toString();
//        password = md5Hex(password+salt);
//        char[] cs =new char[48];
//        for (int i = 0;i<48;i+=3) {
//            cs[i] = password.charAt(i/3*2);
//            char c = salt.charAt(i/3);
//            cs[i+1] = c;
//            cs[i+2] =password.charAt(i/3*2+1);
//        }
//        return new String(cs);
//    }
//    public static boolean verify(String password,String md5) {
//        char[] cs1 = new char[32];
//        char[] cs2 = new char[16];
//        for (int i = 0;i<48;i+=3) {
//            cs1[i/3*2] = md5.charAt(i);
//            cs1[i/3*2+1] = md5.charAt(i+2);
//            cs2[i/3] = md5.charAt(i+1);
//        }
//        String salt = new String(cs2);
//        return md5Hex(password+salt).equals(new String(cs1));
//    }
//    private static String md5Hex(String src) {
//        try {
//            MessageDigest md5 = MessageDigest.getInstance("md5");
//            byte[] bs = md5.digest(src.getBytes());
//            return new String(new Hex().encode(bs));
//        }catch (Exception e){
//            return null;
//        }
//    }
//
//
//
//}
public class MD5Util {
    public static String stringToMD5(String string){
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        // 计算md5函数
        md.update(string.getBytes());
        // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
        // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
        return new BigInteger(1, md.digest()).toString(16);
    }
}

