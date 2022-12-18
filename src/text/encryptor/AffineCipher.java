/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.encryptor;

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
                cipher = cipher 
                    + (char) ((((m * (msg[i] - 'A')) + k) % 26) + 'A'); 
              }
              else 
              { 
                cipher += msg[i]; 
              } 
            } 
    return cipher; 
    }
     
     
     
    public static int gcd(int a, int b)
    {
        
        if (a == 0)
            return b;
        else
            return gcd(b % a, a);
    
    }
 
 
    public static String decrypt(String cipher,int m,int k)
    {
            String msg = ""; 
            int a_inv = 0; 
            int flag = 0; 
            for (int i = 0; i < 26; i++) 
            { 
              flag = (m * i) % 26; 
              if (flag == 1) 
              { 
                a_inv = i; 
              } 
            } 
            for (int i = 0; i < cipher.length(); i++) 
            { 
              if (cipher.charAt(i) != ' ') 
              { 
                msg = msg + (char) (((a_inv * 
                    ((cipher.charAt(i) + 'A' - k)) % 26)) + 'A'); 
              } 
              else 
              { 
                msg += cipher.charAt(i); 
              } 
            } 
            return msg; 
    }
}
