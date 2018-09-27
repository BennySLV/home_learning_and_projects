/**
 * Codewars: Sum of Positive Numbers
 *
 * This program will read an array of numbers
 * and sum only those numbers in the array
 * that are positive.
 *
 * Therefore any negative numbers will
 * be omitted from the resulting sum
 *
 * @author Ben Silveston
 */
public class SumOfPositiveNumbers {
    /**
     * Sum all of the positive numbers
     * found within an array.
     *
     * If the array is empty then return 0
     * as a default value.
     *
     * @param array The array of numbers
     * @return The sum of all the positive numbers in the array
     */
    public static int sumOfPositiveNumbersInArray(int[] array) {
        int sumOfPositiveNumbers = 0;
        if(array.length > 0) {
            for(int i = 0; i < array.length; i++) {
                if(array[i] > 0) {
                    sumOfPositiveNumbers += array[i];
                }
            }
        }
        else {
            return 0;
        }
        return sumOfPositiveNumbers;
    }

    /**
     * Main method
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumOfPositiveNumbersInArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(sumOfPositiveNumbersInArray(new int[]{1, -2, 3, 4, 5}));
        System.out.println(sumOfPositiveNumbersInArray(new int[]{}));
        System.out.println(sumOfPositiveNumbersInArray(new int[]{-1, -2, -3, -4, -5}));
        System.out.println(sumOfPositiveNumbersInArray(new int[]{-1, 2, 3, 4, -5}));
    }
} 