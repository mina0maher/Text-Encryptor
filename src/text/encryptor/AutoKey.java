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

    public static String encrypt(String plainText,String keyword) {
        // TODO Auto-generated method stub

            
            int len = plainText.length(), asciiValue, newValue, letterValue, x = 0, counter = 0, nexti = 0;
            String ciphertext = new String();
            char current;
            plainText = plainText.toUpperCase(); //it makes it easier to have it all in one case
            keyword = keyword.toUpperCase();

            for (int i = 0; i < keyword.length(); i++)
            {
                current = plainText.charAt(i);
                if (Character.isSpace(current))
                {
                    ciphertext += ' ';
                    i++;
                    current = plainText.charAt(i);
                }

                asciiValue = ((int)current);
                //if it's an uppercase letter, encode it
                if (asciiValue >= 65 && asciiValue <= 90)
                {
                    letterValue = asciiValue - 65;
                    newValue = letterValue + (((int)(keyword.charAt(counter))) - 65);
                    newValue %= 26;
                    ciphertext += (char)(newValue + 65);//add it to the ciphertext
                    counter++;
                }
                nexti = i;
            }

            x = 0;
            for (int i = nexti + 1; i < len; i++)
            {
                char temp = ' ';
                current = plainText.charAt(i);
                if (Character.isSpace(current))
                {
                    ciphertext += ' ';
                    i++;
                    current = plainText.charAt(i);
                }

                asciiValue = ((int)current);
                //if it's an uppercase letter, encode it
                if (asciiValue >= 65 && asciiValue <= 90)
                {
                    letterValue = asciiValue - 65;
                    temp = ciphertext.charAt(x);
                    while (temp == ' ')
                    {
                        x++;
                        temp = ciphertext.charAt(x);
                    }

                    newValue = letterValue + (((int)(temp)) - 65);//add the shift

                    newValue %= 26;
                    ciphertext += (char)(newValue + 65);//add it to the ciphertext
                    x++;
                }

                temp = ' ';
            }
            return ciphertext;

        }


    public static String decrypt(String ciphertext,String keyy) {

        int x = 0, len = ciphertext.length(), asciiValue, newValue, letterValue, y = 0;
        String plaintext = new String();
        char current, temp = ' ';
        ciphertext = ciphertext.toLowerCase();//it makes it easier to have it all in one case
        int keywordLength = keyy.length();

        for (int i = 0; i < keywordLength; i++)
        {
            if (x < ciphertext.length())
            {
                plaintext += ciphertext.charAt(x);
                x++;

                if (Character.isSpace(ciphertext.charAt(x - 1)))
                {
                    plaintext += ciphertext.charAt(x);
                    x++;
                }
                y = x;
            }
        }

        x = 0;
        for (int i = 0; i < (len - y); i++)
        {

            current = ciphertext.charAt(i + y);
            if (Character.isSpace(current))
                plaintext += ' ';


            else
            {
                asciiValue = ((int)current);
                if (asciiValue >= 97 && asciiValue <= 122)
                {
                    letterValue = asciiValue - 97;

                    temp = ciphertext.charAt(x);
                    while (temp == ' ')
                    {
                        x++;
                        temp = ciphertext.charAt(x);
                    }

                    newValue = letterValue - (((int)(temp)) - 97); //take off the shift
                    newValue %= 26;
                    //if we've gone below 0, we add 26, which has the effect of wrapping around to the end of the alphabet
                    if (newValue < 0)
                        newValue += 26;

                    plaintext += (char)(newValue + 97);//add it to the plaintext
                    x++;
                }
            }
            temp = ' ';
        }
        return plaintext;
    }


 }

