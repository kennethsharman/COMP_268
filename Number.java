
/**
 *              Question 9, Assignment 1, COMP 268
 * Class:       Number.java
 * Purpose:     Provide methods for checking characteristics of a particular
 *              integer, and a method to add numbers 1-113 to an Arraylist.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 28, 2017
 */
import java.util.ArrayList; // Make ArrayList available

public class Number {

    /**
     * Add numbers 1-113 to and ArrayList
     *
     * @return ArrayList of base type String.
     */
    public static ArrayList<String> iterate() {
        ArrayList<String> list = new ArrayList<>(); // Create new ArrayList
        for (int i = 1; i <= 113; i++) { // For numbers 1-113
            list.add(String.valueOf(i)); // add number to element of ArrayList
        }
        return list;
    } // end iterate

    /**
     * Check to see if integer passed is divisible by 5.
     *
     * @param n An int data type
     * @return boolean
     */
    public static boolean isDivisibleBy5(int n) {
        boolean result = false; // initialize result to false
        if (n % 5 == 0) { // If the number is divisible by 5,
            result = true; // change result to true.
        }
        return result;
    }

    /**
     * Check to see if integer passed is divisible by 7.
     *
     * @param n An int data type
     * @return boolean
     */
    public static boolean isDivisibleBy7(int n) {
        boolean result = false; // Initialize result to false.
        if (n % 7 == 0) { // If the number is divisible by 7,
            result = true; // change result to true.
        }
        return result;
    }

    /**
     * Check to see if number is odd.
     *
     * @param n An int data type
     * @return boolean
     */
    public static boolean isOdd(int n) {
        boolean result = false; // Initialize result to false
        if (!(n % 2 == 0)) { // In number is NOT divisble by 2
            result = true; // Change result to true.
        }
        return result;
    }

    /**
     * Check to see if the number is a prime number.
     *
     * @param n An int data type
     * @return boolean
     */
    public static boolean isPrime(int n) {
        boolean result = true; // Initialize result to true.
        if (n == 1) { // If number is 1 then it is not a prime number.
            result = false;
        }
        for (int i = 2; i <= n / 2; i++) { // Dividing by: [2, number/2]
            if (n % i == 0) { // Check to see if number is a divisor
                result = false; // If it is a divisor, then it is not prime.
            }
        }
        return result;
    }

} // end class Number
