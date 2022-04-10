/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseworkProject;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author lucas
 */
public class PasswordManager {
    private static final Random secureRandom = new SecureRandom();
    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#!£&*^";
    private static final int ITERATIONS = 1000;
    private static final int KEY_LENGTH = 200;
    
    public static String generateSalt(int length){
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            result.append(CHARACTERS.charAt(secureRandom.nextInt(CHARACTERS.length())));
        }
        return new String(result);
    }
    
    public static byte[] hash(char[] password, byte[] salt){
        PBEKeySpec keySpec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGTH);
        Arrays.fill(password, Character.MIN_VALUE);
        try {
            SecretKeyFactory secretKF = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            return secretKF.generateSecret(keySpec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
            throw new AssertionError("Error while hashing the password " + ex.getMessage(), ex);
        }
        finally{
            keySpec.clearPassword();
        }
    }
    
    public static String generateSecurePassword(String password, String salt){
        String result = null;
        byte[] securePassword = hash(password.toCharArray(), salt.getBytes());
        result = Base64.getEncoder().encodeToString(securePassword);
        return result;    
    }
    
    public static boolean verifyPassword(String passwordInput, String securePassword, String salt){
        boolean result = false;
        String newSecurePassword = generateSecurePassword(passwordInput, salt);
        result = newSecurePassword.equalsIgnoreCase(securePassword);
        return result;
    }
}
