/**
 * Codewars: Reversed String Kata
 *
 * This program will take a String
 * value as input and reverse that String
 * and then print the output
 *
 * @author Ben Silveston
 */
public class ReversedString {
    /**
     * Reverse a given String value
     *
     * @param str The String to be reversed
     * @return The reverse of the String
     */
    public static StringBuffer reverseString(String str) {
        StringBuffer reversedString = new StringBuffer();
        String[] splitWord = str.split("");
        for(int i = splitWord.length - 1; i >= 0; i--) {
            reversedString.append(splitWord[i]);
        }
        return reversedString;
    }

    /**
     * Main method
     *
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        System.out.println(reverseString("world"));
    }
} 