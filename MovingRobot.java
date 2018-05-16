
/**
 *              Question 2, Assignment 9, COMP 268
 * Class:       MovingRobot.java
 * Purpose:     Extend the Robot.java class to describe MovingRobot object that
 *              moves from one location to another in a 2D matrix.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        February 24, 2017
 */
import java.util.ArrayList; // Make ArrayList available.

public class MovingRobot extends Robot { // Subclass of Robot.java

    ArrayList<Integer> moves = new ArrayList<>();// Create new instance of 
    // ArrayList, used to store the sequence of MovingRobot moves.
    int nextMove; // Value of next MovingRobot move.

    /**
     * Determine if the value of nextMove is a valid move, within the matrix.
     * The move is invalid if it would take MovingRobot outside of the range of
     * the defined, square, matrix.
     *
     * @return boolean data type representing if nextMove is a valid move.
     */
    public boolean validateNextMove() {
        boolean isValid = true; // Intialize return variable to true.
        int MATRIX_SIZE = 9; // Define size of square matrix. Inclusive of 0. 

        switch (nextMove) {
            case 1: // If the next move is UP:
                if (getY() == 0) {  // and MovingRobot has y coordinate of 0
                    isValid = false; // then the move is invalid.
                }
                break;
            case 2: // If the next move is DOWN:
                if (getY() == MATRIX_SIZE) {
                    // and MovingRobot is at bottom of the matrix
                    isValid = false; // then the move is invalid.
                }
                break;
            case 3: // If the next move is LEFT:
                if (getX() == 0) { // and MovingRobot has an x coordinate of 0
                    isValid = false; // then the move is invalid.
                }
                break;
            case 4: // If the next move is RIGHT:
                if (getX() == MATRIX_SIZE) {
                    // and MovingRobot is at the far right end of the matrix
                    isValid = false; // then the move is invalid.
                }
                break;
            case 5: // If the next move is to the LEFT_UP_CORNER
                if ((getX() == 0) || (getY() == 0)) {
                    // and MovingRobot has an x or y coordinate of 0
                    isValid = false; // then the move is invalid.
                }
                break;
            case 6: // If the next move is to the LEFT_DOWN_CORNER
                if ((getX() == 0) || (getY() == MATRIX_SIZE)) {
                    // and MovingRobot has an x coordinate of 0 or MovingRobot
                    // is at the bottom of the matrix
                    isValid = false; // the move is invalid.
                }
                break;
            case 7: // If the next move is to the RIGHT_UP_CORNER
                if ((getX() == MATRIX_SIZE) || (getY() == 0)) {
                    // and MovingRobot is at the far right end of the matrix or
                    // has a y coordinate of 0
                    isValid = false; // then the move is invalid
                }
                break;
            case 8: // If the next move is to the RIGHT_DOWN_CORNER
                if ((getX() == MATRIX_SIZE) || (getY() == MATRIX_SIZE)) {
                    // and MovingRobot is at the bottom of the matrix or at the
                    // far right end of the matrix
                    isValid = false; // then the move is invalid.
                }
                break;
        } // end switch

        return isValid;
    } // end validateNextMove

    /**
     * Generate random integer from 1 to 8.
     *
     * @return integer data type.
     */
    public int generateNextMove() {
        nextMove = (int) (Math.random() * 8) + 1; // Generate int in range [1,8]
        return nextMove;
    }

    /**
     * Create instance of MovingRobot. The location of MovingRobot, within the
     * matrix, is initialized.
     *
     * @param x integer data type.
     * @param y integer data type.
     */
    public MovingRobot(int x, int y) {
        super(x, y); // Call to the constructor in the super class, Robot.java
    }

    /**
     * Determine if the matrix position of 2 instances of Robot, are equal.
     *
     * @param r1 instance of Robot
     * @param r2 instance of Robot
     * @return boolean data type representing if the 2 instances have same x and
     * y coordinates.
     */
    public static boolean sameSlot(Robot r1, Robot r2) {
        boolean isSameSlot = false; // Initialize return variable to false.

        if ((r1.getX() == r2.getX()) && (r1.getY() == r2.getY())) {
            // If the instances have matching x and y coordinates
            isSameSlot = true; // Assign true to return variable.
        }
        return isSameSlot;
    }

    /**
     * Build and return a formatted String containing the sequence of random
     * integers, corresponding to the moves executed by MovingRobot.
     *
     * @return String data type.
     */
    public String printMoves() {
        StringBuilder sb = new StringBuilder();
        // Create new instance of StringBuilder

        int count = 0; // Number of moves processed.
        for (int i = 0; i < moves.size(); i++) {
            // For each move in moves ArrayList:
            sb.append(moves.get(i)); // Add move to StringBuilder object.
            sb.append(", "); // Add a comma and space to StringBuilder object.
            count++; // Increase number of moves processed by 1.
            if ((count % 25) == 0) { // After each set of 25 moves added
                sb.append("\n"); // Move to next line.
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        // Remove comma and space from the last move added
        String str = sb.toString();
        // Assign characters in StringBuilder object to String return variable.
        return str;
    }

    /**
     * Randomly change location of MovingRobot to 1 of 8 possible adjacent slots
     * in the matrix.
     */
    public void move() {

        do {
            generateNextMove(); // Generate random integer from 1 to 8.
            validateNextMove(); // Determine if move is valid
        } while (validateNextMove() == false); // Until generated move is valid.

        moves.add(nextMove); // Add move to moves ArrayList

        switch (nextMove) {
            case 1: // If move is UP:
                setY(getY() - 1); // Reduce y coordinate by 1.
                break;
            case 2: // If move is DOWN:
                setY(getY() + 1); // Increase y coordinate by 1.
                break;
            case 3: // If move is to the LEFT:
                setX(getX() - 1); // Reduce x coordinate by 1.
                break;
            case 4: // If move is to the RIGHT:
                setX(getX() + 1); // Increase x coordinate by 1.
                break;
            case 5: // If move is to the LEFT_UP_CORNER:
                setX(getX() - 1); // Reduce x coordinate by 1.
                setY(getY() - 1); // Reduce y coordinate by 1.
                break;
            case 6: // If move is to the LEFT_DOWN_CORNER:
                setX(getX() - 1); // Reduce x coordinate by 1.
                setY(getY() + 1); // Increase y coordinate by 1.
                break;
            case 7: // If move is to the RIGHT_UP_CORNER:
                setX(getX() + 1); // Increase x coordinate by 1.
                setY(getY() - 1); // Reduce y coordinate by 1.
                break;
            case 8: // If mve is to the RIGHT_DOWN_CORNER:
                setX(getX() + 1); // Increase x coordinate by 1.
                setY(getY() + 1); // Increase y coordinate by 1.
                break;
        } // end switch

    } // end move()

} // end class MovingRobot
