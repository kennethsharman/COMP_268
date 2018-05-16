
/**
 *              Question 9, Assignment 1, COMP 268
 * Class:       NumberDemo.java
 * Purpose:     Make use of the methods in Number.java by displaying a list
 *              of numbers, along with their respective characteristics.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 28, 2017
 */
public class NumberDemo {

    public static void main(String[] args) {

        for (String num : Number.iterate()) { // For numbers 1-113:
            System.out.printf("%-5s", num + ":"); // Display number

            if (Number.isOdd(Integer.parseInt(num))) { // If number is odd,
                System.out.print(num + " is odd"); // Display that fact.
                if (commaAfterOdd(Integer.parseInt(num))) {
                    printComma(); // If appropriate, include comma in output.
                }
            }

            if (Number.isDivisibleBy5(Integer.parseInt(num))) { // If divisible by 5, 
                System.out.print("hi five"); // Display "hi five"
                if (commaAfter5(Integer.parseInt(num))) {
                    printComma(); // If appropriate, include a comma in output.
                }
            }

            if (Number.isDivisibleBy7(2 * Integer.parseInt(num) + 1)) {
                // If the total of a number and its subsequent number is divisble by 7 
                System.out.print("wow"); // Display "wow"
                if (commaAfter7(Integer.parseInt(num))) {
                    printComma(); // If appropriate, include comma in output.
                }
            }
            if (Number.isPrime(Integer.parseInt(num))) { // If prime number.
                System.out.print("prime"); // Display that fact.
            }
            System.out.println();
        }

    } // end of main()

    /**
     * Output a comma, followed by a space.
     */
    static void printComma() {
        System.out.print(", ");
    }

    /**
     * Check to see if line if finished with output. Boolean indicates if a
     * comma is required.
     *
     * @param x An int data type.
     * @return boolean
     */
    static boolean commaAfterOdd(int x) {
        boolean result;
        result = Number.isDivisibleBy5(x) || Number.isDivisibleBy7(2 * x + 1)
                || Number.isPrime(x);
        // If any remaining characters are true, set result equal to true. 
        return result;
    } // end checkOutput

    /**
     * Check to see if line if finished with output. Boolean indicates if a
     * comma is required.
     *
     * @param x An int data type.
     * @return boolean
     */
    static boolean commaAfter5(int x) {
        boolean result;
        result = Number.isDivisibleBy7(2 * x + 1) || Number.isPrime(x);
        // If any remaining characters are true, set result equal to true.
        return result;
    } // end checkOutput

    /**
     * Check to see if line if finished with output. Boolean indicates if a
     * comma is required.
     *
     * @param x An int data type.
     * @return boolean
     */
    static boolean commaAfter7(int x) {
        boolean result;
        result = Number.isPrime(x);
        // If any remaining characters are true, set result equal to true.
        return result;
    } // end checkOutput

} // end class NumberDemo
