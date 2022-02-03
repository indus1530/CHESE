package edu.aku.hassannaqvi.chese.core;

import android.util.Base64;
import android.util.Log;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class UserAuth {

    private static final String TAG = "UserAuth";


    public static String generatePassword(String password)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        int iterations = 1000;
        char[] chars = password.toCharArray();
        byte[] salt = getSalt();

        PBEKeySpec spec = new PBEKeySpec(chars, salt, iterations, 64 * 8);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");

        byte[] hash = skf.generateSecret(spec).getEncoded();
        Log.d(TAG, "generateStorngPasswordHash: " + Base64.encodeToString(salt, Base64.NO_WRAP) + Base64.encodeToString(hash, Base64.NO_WRAP));
        return Base64.encodeToString(salt, Base64.NO_WRAP) + Base64.encodeToString(hash, Base64.NO_WRAP);
    }


    public static boolean checkPassword(String password, String oldPassword)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        int iterations = 1000;
        char[] chars = password.toCharArray();
        byte[] salt = Base64.decode(oldPassword.substring(0, 24), Base64.NO_WRAP);

        /*  byte[] salt = Arrays.copyOfRange(oldPassword.getBytes(), 0, 24);*/
        // byte[] salt = Arrays.copyOfRange(oldPassword.getBytes(), 16, oldPassword.getBytes().length);
        // byte[] salt = oldPassword.substring(0, 24).getBytes();
        //String salt = password+""+password;
        Log.d(TAG, "checkStorngPasswordHash: oldPassword " + oldPassword);
        Log.d(TAG, "checkStorngPasswordHash: salt " + salt);
        Log.d(TAG, "checkStorngPasswordHash: salt decoded " + salt);
        Log.d(TAG, "checkStorngPasswordHash: salt string " + new String(salt));
        //byte[] saltb = salt.getBytes();
        Log.d(TAG, "checkStorngPasswordHash: saltb " + new String(salt));


        PBEKeySpec spec = new PBEKeySpec(chars, salt, iterations, 64 * 8);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");

        byte[] hash = skf.generateSecret(spec).getEncoded();
        String genPass = Base64.encodeToString(salt, Base64.NO_WRAP) + Base64.encodeToString(hash, Base64.NO_WRAP);
        Log.d(TAG, "checkStorngPasswordHash: hash " + Base64.encodeToString(salt, Base64.NO_WRAP) + Base64.encodeToString(hash, Base64.NO_WRAP));
        Log.d(TAG, "checkStorngPasswordHash: oldpassword " + oldPassword);
        Log.d(TAG, "checkStorngPasswordHash: genPass " + (Base64.encodeToString(salt, Base64.NO_WRAP) + Base64.encodeToString(hash, Base64.NO_WRAP)).equals(oldPassword));
        return genPass.equals(oldPassword);
    }

    private static byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }
}
