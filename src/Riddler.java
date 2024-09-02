// Isha Gupta
// Sept 3, 2024
// import java.sql.SQLOutput;

import java.sql.SQLOutput;

/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Isha Gupta
 */
public class Riddler {

    // Shift message over by 9
    public String decryptOne(String encrypted) {
        String decrypted = "";
        int letter;
        for (int i = 0; i < encrypted.length(); i++) {
            letter = encrypted.charAt(i);

            // If the letter is lowercase shift and map to it's corresponding lowercase letter
            if(letter >= 'a' && letter <= 'z'){
                // Use mod 26 to solve the wrap-around issue
                decrypted += (char)((letter - 'a' + 9) % 26 + 'a');
            }
            else if((letter >= 'A' && letter <= 'Z')){
                decrypted += (char)((letter - 'A' + 9) % 26 + 'A');
            }
            // If it's not a letter (ie. space, comma, etc) do not shift
            else{
                decrypted += (char) letter;
            }
        }
        System.out.println(decrypted);
        return decrypted;
    }

    // Convert from Strings to ascii values to chars to decode
    public String decryptTwo(String encrypted) {
        String decrypted = "";

        // Divides the message based on where the spaces are
        String[] letters = encrypted.split(" ");
        // Creates an array of ints to store the converted strings above
        int[] ascii = new int[letters.length];

        for(int i = 0; i < letters.length; i++) {
            // parseInt converts from text into ascii values (radix = base, we want base 10 for decimals)
            ascii[i] = Integer.parseInt(letters[i], 10);
            decrypted += (char)ascii[i];
        }

        System.out.println(decrypted);
        return decrypted;
    }

    // Decode:  Strings --> binary --> ascii --> characters
    public String decryptThree(String encrypted) {
        String decrypted = "";
        int ascii = 0;
        // Add 8 each iteration bc each character is represented by 8 binary numbers
        for(int i = 0; i < encrypted.length() - 8 ; i += 8){
            ascii = Integer.parseInt(encrypted.substring(i, i+8), 2);
            decrypted += (char)ascii;
        }
        System.out.println(decrypted);
        return decrypted;
    }

    // Shift from Dingbat to letters
    public String decryptFour(String encrypted) {
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            // Shifts each dingbat character into decimal and adds to decrypted message
            decrypted += (char) (encrypted.charAt(i) - 9919);
        }

        System.out.println(decrypted);
        return decrypted;
    }
}
