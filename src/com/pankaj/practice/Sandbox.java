package com.pankaj.practice;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.util.Base64;
import java.security.*;

public class Sandbox {

    public static String encrypt(String key, String initVector, String value) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(Base64.getEncoder().encode(value.getBytes()));
            System.out.println("encrypted string: "
                    + Base64.getEncoder().encodeToString(encrypted));

            return Base64.getEncoder().encodeToString(encrypted).toString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public static String decrypt(String key, String initVector, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");


            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

        
            byte[] temp = Base64.getDecoder().decode(encrypted);
            System.out.println((new String(temp)).length());
            byte[] original = cipher.doFinal(temp);
            original = Base64.getDecoder().decode(original);

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    // 
    
    
    //
    public static void main(String[] args) {
        String key = "0123456789abcdef"; // 128 bit key
        String initVector = "fedcba9876543210"; // 16 bytes IV

//        for (Provider provider : Security.getProviders()) {
//            System.out.println(provider.getName());
//            for (String key2 : provider.stringPropertyNames()) {
//                System.out.println("\t" + key2 + "\t" + provider.getProperty(key2));
//            }
//        }
        System.out.println(  encrypt(key, initVector, "Pankaj Kumar rana"));
        System.out.println(decrypt(key, initVector,
                encrypt(key, initVector, "Hello World!!!")));

        System.out.println(decrypt(key, initVector, "R090NWG9kSGlnUktHdEI5U05sRGxNdWF4NFFjUUV0O0="));
    }
}