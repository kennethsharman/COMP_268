
/**
 *              Question 6, Assignment 1, COMP 268
 * Class:       TriangleDemo.java
 * Purpose:     Calculate the side of a right triangle, given values for the
 *              other sides. Use Triangle class to determine is a particular
 *              triangle is a right triangle.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 24, 2017
 */
public class TriangleDemo {

    static double a, b, c; // Sides of a triangle. 'c' is the hypotenuse.

    public static void main(String[] args) {

        System.out.println("Question 1a");
        System.out.println("Given sides of right triangle:"
                + " a = 48.0 and c = 80.0:");
        System.out.println("\tb = " + calculateB(48, 80)); // Calculate unknown side.
        System.out.println();

        System.out.println("Question 1b");
        System.out.println("Given side of right triangle:"
                + " a = 84.0 and c = 91.0:");
        System.out.println("\tb = " + calculateB(84, 91)); // Calculate unknown side.
        System.out.println();

        Triangle firstTriangle = new Triangle(45, 55, 75); // Create new instance of Triangle
        inspectTriangle(firstTriangle); // Determine if triangle is right triangle.

        Triangle secondTriangle = new Triangle(28, 45, 53); // Create new instance of Triangle
        inspectTriangle(secondTriangle); // Determine if triangle is right triangle.

    } // end main()

    /**
     * Using the 2 known sides, passed as actual parameters, calculate length of
     * the remaining side.
     *
     * @param a - One of the "legs" of triangle. Type double.
     * @param c - Hypotenuse of triangle. Type double.
     * @return - length of unknown side. Type double.
     */
    static double calculateB(double a, double c) {
        b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
        return b; // b = (c^2 - a^2)^(1/2) 
    }

    /**
     * Method provides formatted output, displaying whether or not the triangle
     * is a right triangle.
     *
     * @param triangle instance.
     */
    static void inspectTriangle(Triangle triangle) {

        System.out.println("*****************************************");
        System.out.println();

        System.out.print("Given a = " + triangle.getA()); // Getter from Triangle class
        System.out.print(", b = " + triangle.getB()); // Getter from Triangle class
        System.out.println(", c = " + triangle.getC()); // Getter from Triangle class
        if (triangle.isRightTriangle()) { // Returns a boolean value
            System.out.println("Math tells us this is a right triangle.");
        } else {
            System.out.println("Math tells us this is not a right triangle");
        }
        System.out.println();

    } // end inspectTriangle.

} // end class TriangleDemo

