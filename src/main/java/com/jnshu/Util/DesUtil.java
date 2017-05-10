package com.jnshu.Util;

import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;
@Component
public class DesUtil {
    public static byte[] desCrypto(String string, String password) {
        try {

            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            // 创建一个密匙工厂，然后用它把DESKeySpec转换成
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            // Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES");
            // 用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            // 现在，获取数据并加密
            // 正式执行加密操作
            return cipher.doFinal(string.getBytes());
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] decrypt(byte[] src, String password) throws Exception {
        // DES算法要求有一个可信任的随机数源
        SecureRandom random = new SecureRandom();
        // 创建一个DESKeySpec对象
        DESKeySpec desKey = new DESKeySpec(password.getBytes());
        // 创建一个密匙工厂
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        // 将DESKeySpec对象转换成SecretKey对象
        SecretKey securekey = keyFactory.generateSecret(desKey);
        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance("DES");
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, random);
        // 真正开始解密操作
        return cipher.doFinal(src);
    }
//    public static void main(String[] args) {
//	    DesUtil desUtil =new DesUtil();
//	    //待加密内容
//	    String str = "1"+new Date().getTime();
//	    //密码，长度要是8的倍数
//	    String password = "12345678";
//	    byte[] result = desUtil.desCrypto(str.getBytes(),password);
//	    System.out.println("加密后内容为："+new String(result));
//
//	    //直接将如上内容解密
//	    try {
//	            byte[] decryResult = desUtil.decrypt(result, password);
//	            System.out.println("加密后内容为："+new String(decryResult));
//	    } catch (Exception e1) {
//	            e1.printStackTrace();
//	    }
//    }
}
