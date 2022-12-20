
package text.encryptor.utilities;


/**
 *
 * @author maher
 */
public class Utilities {
    
    public static int gcd(int e, int z)
    {
        if (e == 0)
            return z;
        else
            return gcd(z % e, e);
    }

   public static int getIndex(char alphabet){
        if (alphabet>='A' &&alphabet<='Z'){
            return (alphabet-'A');
        }
        else return (alphabet);
    }

    public static char  getAlphabet(int index){
       if (index>=0 &&index<=25){
           return (char)(index+'A');
       }
       else return (char)(index);
    }
}
