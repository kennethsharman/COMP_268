
/**
 *              Question 2, Assignment 9, COMP 268
 * Class:       Robot.java
 * Purpose:     Provide variables and methods which describe a Robot object
 *              that exists in a 2D matrix.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        February 24, 2017
 */
public class Robot {

    int x; // x coordinate of Robot location in matrix.
    int y; // y coordinate of Robot location in matrix.
    // Constants are values corresponding to the Robot moving from its current
    // location to one of the eight possible adjacent slots in the matrix.
    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;
    public static final int LEFT_UP_CORNER = 5;
    public static final int LEFT_DOWN_CORNER = 6;
    public static final int RIGHT_UP_CORNER = 7;
    public static final int RIGHT_DOWN_CORNER = 8;

    /**
     * Retrieve the value of x.
     *
     * @return integer data type.
     */
    public int getX() {
        return x;
    }

    /**
     * Retrieve the value of y.
     *
     * @return integer data type.
     */
    public int getY() {
        return y;
    }

    /**
     * Create instance of Robot. The location of the Robot, within the matrix,
     * is initialized.
     *
     * @param x integer data type representing the x coordinate.
     * @param y integer data type representing the y coordinate.
     */
    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Set the value of x.
     *
     * @param x integer data type representing the x coordinate.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Set the value of y.
     *
     * @param y integer data type representing the y coordinate.
     */
    public void setY(int y) {
        this.y = y;
    }

} // end class Robot
