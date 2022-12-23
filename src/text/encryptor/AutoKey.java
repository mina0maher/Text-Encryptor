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
        // remove the extra letters from end
        newKey = newKey.substring(0, newKey.length() - key.length());
        String encryptMsg = "";
        for (int x = 0; x < len; x++) {
            int p = getIndex(plainText.charAt(x));
            int k = getIndex(newKey.charAt(x));
            int total = (p+k) % 26;
            encryptMsg += getAlphabet(total);
        }
        return encryptMsg;
    }


    public static String decrypt(String cipherText,String key) {
        cipherText = cipherText.toUpperCase();
        String currentKey = key.toUpperCase();

        String decryptMsg = "";
        for (int x = 0; x < cipherText.length(); x++) {
            int c = getIndex(cipherText.charAt(x));
            int k= getIndex(currentKey.charAt(x));
            int total = (c-k) % 26;
            // if negative
            total = (total < 0) ? total + 26 : total;
            decryptMsg += getAlphabet(total);
            currentKey += getAlphabet(total);
        }
        return decryptMsg;
    }
 }

