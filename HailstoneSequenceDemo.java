
/**
 *              Question 7, Assignment 1, COMP 268
 * Class:       HailstoneSequenceDemo.java
 * Purpose:     Get integer from user, calculate Hailstone Sequence, display
 *              results and number of steps taken to reach '1'.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 26, 2017
 */
import java.util.Scanner; // Make Scanner class available.
import java.util.ArrayList; // Make ArrayList available.

public class HailstoneSequenceDemo {

    static int startingNumber; // Starting number for sequence.
    static Scanner stdin = new Scanner(System.in); // Create instance of Scanner

    public static void main(String[] arg) {

        ArrayList<Integer> list; // HailstoneSequence.

        System.out.println("We need a start for the hailstone sequence.");
        startingNumber = getNumber();
        System.out.println("Starting the sequence at: " + startingNumber);

        list = HailstoneSequence.getHailstoneSequence(startingNumber);

        for (int term : list) {
            System.out.println(term);
        }

        System.out.println("\nThere were " + list.size()
                + " terms in the sequence.");
        // Instance method list.size() returns numbers of elements in ArrayList
    } // end main()

    /**
     * Collects non negative integer from user, and returns it.
     *
     * @return integer
     */
    static int getNumber() {

        while (true) {
            System.out.print("Please enter integer: ");
            try {
                startingNumber = Integer.parseInt(stdin.nextLine()); // Convert input to type int.
                while (startingNumber <= 0) { // If integer is negative, try again.
                    System.out.println("The starting point must be a positive"
                            + " integer. Please try again.");
                    startingNumber = Integer.parseInt(stdin.nextLine());
                }
                break; // If int is entered, while loop ends.
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input.");
            } // If non integer is entered, user is prompted to try again.
        } // end while

        return startingNumber;

    } // end getNumber()

} // end class HailstoneSequence
