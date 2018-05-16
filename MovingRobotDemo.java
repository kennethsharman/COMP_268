
/**
 *              Question 2, Assignment 9, COMP 268
 * Class:       MovingRobotDemo.java
 * Purpose:     Move 2 instances of MovingRobot until they arrive at the same
 *              location in a 10 x 10 matrix. Display this location and print
 *              the sequence of random integers, corresponding to the moves
 *              executed, for each MovingRobot. User is given option to quit or
 *              run program again.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        February 24, 2017
 */
import java.util.Scanner; // Make Scanner class available.

public class MovingRobotDemo {

    public static void main(String[] args) {

        while (true) { // Loop runs until user terminates program.

            MovingRobot r1 = new MovingRobot(0, 0);
            MovingRobot r2 = new MovingRobot(9, 9);
            // Create 2 instances of MovingRobot and intialize x-y corrdinates.

            System.out.println("\tWelcome to ROBOT MADNESS!!\n");
            System.out.print("Robot 1 has been placed at position ");
            System.out.println(robotPosition(r1));
            // Display x-y corrdinates of MovingRobot, r1.
            System.out.print("Robot 2 has been placed at position ");
            System.out.println(robotPosition(r2));
            // Display x-y corrdinates of MovingRobot, r2.

            do {
                r1.move(); // Move MovingRobot r1 to an adjacent slot.
                r2.move(); // Move MovingRobot r2 to an adjacent slot.
            } while (MovingRobot.sameSlot(r1, r2) == false);
            // Continue until both MovingRobots are in the same slot.

            System.out.print("The 2 robots meet at position ");
            System.out.println(robotPosition(r1));
            // Display x-y corrdinates of MovingRobot, r1 (same as r2).
            System.out.println("Robot 1 used the following sequence of moves:");
            System.out.println(r1.printMoves());
            // Display the sequence of random integers, corresponding to the
            // moves executed by MovingRobot r1.
            System.out.println("Robot 2 used the following sequence of moves:");
            System.out.println(r2.printMoves());
            // Display the sequence of random integers, corresponding to the
            // moves executed by MovingRobot r2.
            runAgain(); // User input dictates whether program is rerun 
            // or program is terminated.
        } // end while loop

    } // end of main()

    /**
     * Retrieve String representation of matrix location of MovingRobot.
     *
     * @param robot - instance of MovingRobot
     * @return String data type.
     */
    public static String robotPosition(MovingRobot robot) {
        String str = "[" + robot.getX() + "][" + robot.getY() + "]";
        // Assign [x][y] location of MovingRobot to String return variable.
        return str;
    }

    /**
     * User input determines whether or not to terminate program.
     */
    public static void runAgain() {
        Scanner stdin = new Scanner(System.in); // Create instance of Scanner.
        String input; // User input.

        System.out.println("\n*******************************************");
        System.out.println("Press \"y\" or \"Y\" to run again.");
        System.out.println("Any other key will end program.");
        // User is asked if they wish to run program again.
        System.out.print("? ");
        input = stdin.nextLine(); // User input is entered.

        switch (input) {
            case ("Y"):
            case ("y"):
                break; // User indicated they do not wish to terminate program.
            default: // Other wise the program is terminated.
                System.out.println("END ROBOT MADNESS!!");
                System.exit(0);
        }

    } // end runAgain

} // end class Moving RobotDemo
