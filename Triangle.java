
/**
 *              Question 6, Assignment 1, COMP 268
 * Class:       Triangle.java
 * Purpose:     Object stores sides of a triangle and instance method determines
 *              if the sides yield a right triangle.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 24, 2017
 */
public class Triangle {

    private boolean rightTriangle; // True if sides produce right triangle.
    private double a; // Side of triangle.
    private double b; // Side of triangle.
    private double c; // Side of triangle. If right triangle, this is hypotenuse.

    /**
     * Create instance of Triangle. Initializes each side of triangle.
     *
     * @param a type double
     * @param b type double
     * @param c type double
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Retrieve value of 'a'.
     *
     * @return type double.
     */
    public double getA() {
        return a;
    }

    /**
     * Retrieve value of 'b'.
     *
     * @return type double.
     */
    public double getB() {
        return b;
    }

    /**
     * Retrieve value of 'c'.
     *
     * @return type double.
     */
    public double getC() {
        return c;
    }

    /**
     * Set the value of side 'a'.
     *
     * @param a type double.
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Set the value of side 'b'.
     *
     * @param b type double.
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Set the value of side 'c'.
     *
     * @param c type double.
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * Determines if the sides of the triangle produce a right triangle.
     *
     * @return type boolean.
     */
    public boolean isRightTriangle() {

        rightTriangle = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2))) == c;
        // If side 'c' is equal to the square root of (a^2 + b^2) then the 
        // pythagorean theorem tells us that this triangle is a right triangle.
        return rightTriangle;
    }

} // end class Triangle
