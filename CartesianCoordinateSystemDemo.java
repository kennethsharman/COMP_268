
/**
 *              Question 3, Assignment 1, COMP 268
 * Class:       CartesianCoordinateSystemDemo.java
 * Purpose:     Test class CartesianCoordinateSystem. Get input from user for
 *              coordinates of 2 points. Calculate distance between two
 *              points using instance of CartesianCoordinateSystem. Display
 *              result with 2 decimal places.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 8, 2017
 */
import java.util.Scanner; // Make Scanner class available for user input.

public class CartesianCoordinateSystemDemo {

    public static void main(String[] args) {

        CartesianCoordinateSystem c = new CartesianCoordinateSystem(); // Create new instance of CartesianCoordinateSystem
        double x1, y1, x2, y2; // Coordinates of two points; (x1, y1) and (x2, y2).

        System.out.println("I will calculate distance between two points "
                + "(x1, y1) and (x2, y2):");
        x1 = getNumber("x1"); // Assign value to x1 coordinate.
        y1 = getNumber("y1"); // Assign value to y1 coordinate.
        x2 = getNumber("x2"); // Assign value to x2 coordinate.
        y2 = getNumber("y2"); // Assign value to y2 coordinate.

        if (numbersMatch(x1, y1, x2, y2) == true) { // If coordinates are the same no distance is calculated.
            System.out.println("The 2 points have same coordinates.");
            System.out.println("There is no distance between the points.");
        } else {
            System.out.print("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: ");
            System.out.printf("%1.2f", c.calculateDistance(x1, y1, x2, y2)); // Call instance method to calculate distance.
            System.out.println();
            System.out.println();
        }

    } // end of main()

    /**
     * Method takes a String, entered by user, and attempts to convert it to
     * type double. If successful the number is returned. If unsuccessful the
     * while loop will prompt user for input, until input can be converted to
     * type double. Formal parameter is the name of the value user is to input.
     *
     * @param value - String displays name of current coordinate.
     * @return - type double
     */
    static double getNumber(String value) {
        Scanner stdin = new Scanner(System.in); // Create new instance of Scanner.
        double num; // number entered by user, for given coordinate. 

        while (true) {
            System.out.print("Please enter " + value + ": ");
            try {
                num = Double.parseDouble(stdin.nextLine()); // Convert input to type double.
                break; // If number is entered, while loop ends.
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        } // end while

        return num;
    }

    /**
     * Method checks to see if the x and y coordinates for each point match that
     * of the other point. A boolean is return indicating the result.
     *
     * @param x1 - x coordinate of first point.
     * @param y1 - y coordinate of first point.
     * @param x2 - x coordinate of second point.
     * @param y2 - y coordinate of second point.
     * @return boolean corresponding to whether or not both points have same
     * coordinates.
     */
    static boolean numbersMatch(double x1, double y1, double x2, double y2) {

        return x1 == x2 && y1 == y2;

    } // end numberMatch

} // end class CartesianCoordinateSystemDemo
