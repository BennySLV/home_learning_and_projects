/**
 * Codewars kata: Next Prime
 *
 * This program will find the next prime number
 * after a given integer as input
 *
 * For example, if the given integer
 * is 12, the next prime number after 12 is 13
 *
 * Likewise the next prime number after
 * 2 is 3
 *
 * Only the next prime integer can
 * be printed out. Therefore
 * all other prime integers need
 * to be omitted upon output
 *
 * @author Ben Silveston
 */
public class NextPrimeNumber {
    /**
     * Find the next prime number
     * based on a given integer
     *
     * Numbers will range from 0 to (10^12).
     *
     * @param n The given integer
     * @return The next prime number after the given integer
     */
    public static int nextPrimeNumber(int n) {
        int nextPrimeNumber = 0;
        double maxNumberRange = Math.pow(10.0, 12.0);
        if(n >= 0) {
            for(int i = 0; i <= maxNumberRange; i++) {
                if(n % 2 != 0) {
                    nextPrimeNumber = n;
                }
            }
        }
        return n;
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(nextPrimeNumber(2)); // next prime number will be 3
    }
} 