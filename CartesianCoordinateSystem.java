
/**
 *              Question 3, Assignment 1, COMP 268
 * Class:       CartesianCoordinateSystem.java
 * Purpose:     The sole operation of this class is to receive locations of two
 *              points, calculate distance between them, and return that value.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 8, 2017
 */
class CartesianCoordinateSystem {

    public double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance; // Distance between points (x1,y1) and (x2,y2).
        double deltaX; // Difference of x values.
        double deltaY; // Difference of y values.
        double radicand; // Expression inside radical.

        deltaX = x2 - x1; // ∆x = x2 - x1.
        deltaY = y2 - y1; // ∆y = y2 - y1.
        radicand = Math.pow(deltaX, 2) + Math.pow(deltaY, 2); // ∆x^2 + ∆y^2.
        distance = Math.pow(radicand, 0.5); // Square root of radican: sqrt(∆x^2 + ∆y^2).

        return distance;
    }
}
