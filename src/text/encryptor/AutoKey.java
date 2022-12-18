/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.encryptor;

import static text.encryptor.utilities.Utilities.getAlphabet;
import static text.encryptor.utilities.Utilities.getIndex;

/**
 *
 * @author maher
 */
  

public final class AutoKey {

    public static String encrypt(String plainText,String key) {
            int len = plainText.length();
            plainText = plainText.toUpperCase();
            key = key.toUpperCase();
            String newKey = key.concat(plainText);
            newKey = newKey.substring(0, newKey.length() - key.length());
            String encryptMsg = "";
            for (int x = 0; x < len; x++) {
                int first = getIndex(plainText.charAt(x));
                int second = getIndex(newKey.charAt(x));
                int total = (first + second) % 26;
                encryptMsg += getAlphabet(total);
            }
            return encryptMsg;

        }


    public static String decrypt(String cipherText,String key) {
        cipherText = cipherText.toUpperCase();
        String currentKey = key.toUpperCase();
        String decryptMsg = "";
         for (int x = 0; x < cipherText.length(); x++) {
            int get1 = getIndex(cipherText.charAt(x));
            int get2 = getIndex(currentKey.charAt(x));
            int total = (get1 - get2) % 26;
            total = (total < 0) ? total + 26 : total;
            decryptMsg += getAlphabet(total);
            currentKey += getAlphabet(total);
        }
        return decryptMsg;
    }
    

 }

