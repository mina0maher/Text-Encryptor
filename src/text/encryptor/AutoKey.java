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
    
    private static int getIndex(char alphabet){
        switch(alphabet){
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
            case 'I':
                return 8;
            case 'J':
                return 9;
            case 'K':
                return 10;
            case 'L':
                return 11;
            case 'M':
                return 12;
            case 'N':
                return 13;
            case 'O':
                return 14;
            case 'P':
                return 15;
            case 'Q':
                return 16;
            case 'R':
                return 17;
            case 'S':
                return 18;
            case 'T':
                return 19;
            case 'U':
                return 20;
            case 'V':
                return 21;
            case 'W':
                return 22;
            case 'X':
                return 23;
            case 'Y':
                return 24;
            case 'Z':
                return 25;
        }
        return -1;
    }
    
    private static char  getAlphabet(int index){
        switch(index){
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                 return 'C';   
            case 3:
                 return 'D';
            case 4:
                 return 'E';
            case 5:
                return 'F';
                case 6:
                return 'G';
            case 7:
                 return 'H';   
            case 8:
                 return 'I';
            case 9:
                 return 'J';
            case 10:
                return 'K';
                case 11:
                return 'L';
            case 12:
                 return 'M';   
            case 13:
                 return 'N';
            case 14:
                 return 'O';
            case 15:
                return 'P';
                case 16:
                return 'Q';
            case 17:
                 return 'R';   
            case 18:
                 return 'S';
            case 19:
                 return 'T';
            case 20:
                return 'U';
                case 21:
                return 'V';
            case 22:
                 return 'W';   
            case 23:
                 return 'X';
            case 24:
                 return 'Y';
            case 25:
                return 'Z';
        }
        return ' ';
    }


 }

