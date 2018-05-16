
/**
 *              Question 7, Assignment 1, COMP 268
 * Class:       HailstoneSequence.java
 * Purpose:     Calculate the Hailstone sequence for a particular number.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 26, 2017
 */
import java.util.ArrayList; // Make ArrayList available

public class HailstoneSequence {

    /**
     * Pass method a positive integer, n. If n is even, divide by 2. If n is
     * odd, multiply by 3 and add 1. Repeat the process until n is equal to 1.
     * Method stores the sequence of values in an ArrayList, and the sequence is
     * returned.
     *
     * @param n - positive integer to start sequence.
     * @return ArrayList of each number in sequence.
     */
    public static ArrayList<Integer> getHailstoneSequence(int n) {

        ArrayList<Integer> sequence; // Hailstone sequence
        sequence = new ArrayList<>(); // Construct sequence, as it is an object.

        while (n != 1) {
            if (n % 2 == 0) { // If N is even
                n = n / 2;
            } else { // If N is odd
                n = 3 * n + 1;
            }
            sequence.add(n); // Add new element to ArrayList, reffering to N.
        }

        return sequence;

    } // end getHailstoneSequence

} // end class HailstoneSequence
