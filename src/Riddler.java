import java.sql.SQLOutput;

/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        int letter = 0;
        System.out.println("A: " + (int)'A');
        System.out.println("Z: " + (int)'Z');
        System.out.println("a: " + (int)'a');
        System.out.println("z: " + (int)'z');
        for (int i = 0; i < encrypted.length(); i++) {
            letter = encrypted.charAt(i);
            if(letter >= 'a' && letter <= 'z'){
                letter += 9;
                if(letter > 'z'){
                    decrypted += (char)(letter - 'z' - 1 + 'a');
                }
                else {
                    decrypted += (char) (letter);
                }
            }
            else if((letter >= 'A' && letter <= 'Z')){
                letter += 9;
                if(letter > 'Z'){
                    decrypted += (char)(letter - 'Z' + 'A' -1);
                }
                else {
                    decrypted += (char) (letter);
                }
            }
            else{
                decrypted += (char) letter;
            }

        }

        System.out.println(decrypted);

        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptTwo() function.

        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
