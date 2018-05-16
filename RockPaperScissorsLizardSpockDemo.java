
/**
 *              Question 2, Assignment 2, COMP 268
 * Class:       RockPaperScissorsLizardSpockDemo.java
 * Purpose:     Play Rock, Paper, Scissors, Lizard, Spock game by utilizing
 *              the variables and methods defined in
 *              RockPaperScissorsLizardSpock.java class. User is given option to
 *              play again or quit after 1 game is completed. Both players are
 *              computer players.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Feb 15, 2017
 */
import java.util.Scanner; // Make Scanner class available.

public class RockPaperScissorsLizardSpockDemo {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in); // Create instance of Scanner.
        int player1, player2; // Value of weapon selected by each player
        String input; // User input.

        System.out.println("\tWelcome to ROCK, PAPER, "
                + "SCISSORS, LIZARD, SPOCK.");
        System.out.println("Game consists of 2 computer players.");
        System.out.println("First to reach 4 consecutive wins, "
                + "is the overall winner");
        System.out.println();
        System.out.println("*****************************");

        while (true) { // Loop runs untl user terminates program.

            RockPaperScissorsLizardSpock game = new RockPaperScissorsLizardSpock();
            // Create new instance of RockPaperScissorsLizardSpock

            while (game.getConsecutiveWins() < 4) {
                player1 = game.random(); // Assign player1 random weapon
                player2 = game.random(); // Assign player2 a random weapon.
                game.play(player1, player2); // play method determines winner or
                // tie, and evaluates win streak.
            } // While loop runs until a player has a 4 game win sreak.

            System.out.println(RockPaperScissorsLizardSpock.convert(
                    game.getLastWinner()) + " WINS!!!!!");
            // Player with 4 game win streak is declared the overall winner.

            System.out.println("*****************************");
            System.out.println("Press \"y\" or \"Y\" to play again. "
                    + "Any other key will end program.");
            // User is asked if they wish to play another round.
            System.out.print("? ");
            input = stdin.nextLine(); // User input is entered.

            switch (input) {
                case ("Y"):
                case ("y"):
                    break; // If user wants to play another round, while loop
                // is evaluated again.
                default: // Other wise the program is terminated.
                    System.out.println("GAME OVER");
                    System.exit(0);
            }
            System.out.println("*****************************");
        } // end while loop

    } // end of main()

} // end class RockPaperScissorsLizardSpock

