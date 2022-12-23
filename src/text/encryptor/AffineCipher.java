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
public class AffineCipher {
     public static String encrypt(char[] msg,int m,int k){
        String cipher = "";
        for (int i = 0; i < msg.length; i++)
        {
            if (msg[i] != ' ')
            {
                // to int -> operation -> to char
                cipher = cipher + getAlphabet (((m * getIndex(msg[i])) + k) % 26);
            }
            else   // skip space
            {
                cipher += msg[i];
            }
        }
        return cipher;
    }

    public static String decrypt(String cipher,int m,int k)
    {
        String msg = "";

        int a_inv = 0;
        int flag = 0;
        for (int i = 0; i < 26; i++)  // until i*m==1 (m*m^-1==1)
        {
            flag = (m * i) % 26;
            if (flag == 1)
            {
                a_inv = i;
            }
        }

        for (int i = 0; i < cipher.length(); i++)
        {
            if (cipher.charAt(i) != ' ')  //skip space
            {
                msg = msg + getAlphabet (((a_inv * (getAlphabet(cipher.charAt(i)%26 ) - k)) % 26));
            }
            else
            {
                msg += cipher.charAt(i);
            }
        }
        return msg;
    }

}
