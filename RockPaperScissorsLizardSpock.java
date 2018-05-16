
/**
 *              Question 2, Assignment 2, COMP 268
 * Class:       RockPaperScissorsLizardSpock.java
 * Purpose:     Provide variables and methods necessary to play Rock, Paper,
 *              Scissors, Lizard, Spock game with 2 computer players.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Feb 15, 2017
 */
public class RockPaperScissorsLizardSpock {

    private int consecutiveWins; // Number of wins in a row.
    private int lastWinner; // Winner from previous game.
    public static final int ROCK = 1; // Player Weapon.
    public static final int PAPER = 2; // Player Weapon.
    public static final int SCISSORS = 3; // Player Weapon.
    public static final int LIZARD = 4; // Player Weapon.
    public static final int SPOCK = 5; // Player Weapon.
    public static final int PLAYER1 = 6; // First Computer Player.
    public static final int PLAYER2 = 7; // Second Computer Player.

    /**
     * Retrieve value of consecutiveWins.
     *
     * @return int data type.
     */
    public int getConsecutiveWins() {
        return consecutiveWins;
    }

    /**
     * Retrieve the value of lastWinner.
     *
     * @return int data type.
     */
    public int getLastWinner() {
        return lastWinner;
    }

    /**
     * Generate random integer from 1 to 5.
     *
     * @return int data type.
     */
    public int random() {
        int i; // Variable to be assigned random int.
        i = (int) (Math.random() * 5) + 1; // Generate integer in range [1,5]
        return i;
    }

    /**
     * Return the String equivalent (name) of the integer passed to the method
     * through its parameter.
     *
     * @param i int data type.
     * @return String corresponding to integer parameter.
     */
    public static String convert(int i) {
        String conversion; // Coverted form of int parameter. 

        switch (i) { // For int 'i':
            case (1): // if i = 1
                conversion = "ROCK"; //  Let conversion refer to "ROCK"
                break;
            case (2): // if i = 2
                conversion = "PAPER"; //  Let conversion refer to "PAPER"
                break;
            case (3): // if i = 3
                conversion = "SCISSORS"; //  Let conversion refer to "SCISSORS"
                break;
            case (4): // if i = 4
                conversion = "LIZARD"; //  Let conversion refer to "LIZARD"
                break;
            case (5): // if i = 5
                conversion = "SPOCK"; //  Let conversion refer to "SPOCK"
                break;
            case (6): // if i = 6
                conversion = "PLAYER1"; //  Let conversion refer to "PLAYER1"
                break;
            case (7): // if i = 7
                conversion = "PLAYER2"; //  Let conversion refer to "PLAYER2"
                break;
            default: // for any other value of the parameter
                conversion = "\"Invalid Weapon\".";
                break; // int does not correspond to a constant
        }
        return conversion;
    } // end convert()

    /**
     * Determine outcome of game. Method must be passed 2 int in range [1-5].
     * The winner is decided using the following rules. Rule 1: Scissors cut
     * paper Rule 2: Paper covers rock Rule 3: Rock crushes lizard Rule 4:
     * Lizard poisons Spock Rule 5: Spock smashes (or melts) scissors Rule 6:
     * Scissors decapitate lizard Rule 7: Lizard eats paper Rule 8: Paper
     * disproves Spock Rule 9: Spock vaporizes rock Rule 10: Rock breaks
     * scissors. If the winner is same as the winner in the previous game,
     * consecutiveWins is increased by one. If the winner didn't win the
     * previous game, the consecutiveWins is set to one. Finally, the winner is
     * assigned to lastWinner, for reference in the next game.
     *
     * @param player1 An int data type from 1-5 representing weapon of PLAYER1.
     * @param player2 An int data type from 1-5 representing weapon of PLAYER2.
     */
    public void play(int player1, int player2) {
        int winner = 0; // Initialize winner to neither PLAYER1=6 or PLAYER2=7
        String player1Selection = convert(player1);
        // String representation of weapon selected by PLAYER1.
        String player2Selection = convert(player2);
        // String representation of weapon selected by PLAYER2.

        System.out.print("Player 1 selected " + player1Selection);
        System.out.println(" Player 2 selected " + player2Selection);
        // Display weapons selected by each player.

        if (player1 < 1 || player1 > 5 || player2 < 1 || player2 > 5) {
            System.out.println("Error. Both players must select valid weapon.");
            System.out.println("Program Terminated.");
            System.exit(0);
        } // If statement checks to see if the parameters are integers in range
        // [1,5]. If not; the program is terminated.

        if (player1 == player2) { // If player1 and player2 are same weapon
            System.out.print("\tTie Game.");
            if (consecutiveWins != 0) { // If there is a current win streak
                System.out.print(" Win streak carried over.");
            }
            System.out.println();
        } else {
            switch (player1) { // Given the selection of PLAYER1
                case (ROCK): // If PLAYER1 selects ROCK
                    switch (player2) {
                        case SCISSORS:
                        case LIZARD: // and PLAYER2 selects SCISSORS or LIZARD
                            System.out.print("\tPlayer 1 Wins.");
                            winner = PLAYER1; // Set winner to PLAYER1
                            break;
                        case PAPER:
                        case SPOCK: // and PLAYER2 selects PAPER or SPOCK
                            System.out.print("\tPlayer 2 Wins.");
                            winner = PLAYER2; // Set winner to PLAYER2
                            break;
                        default:
                    }
                    break;
                case (PAPER): // If PLAYER1 selects PAPER
                    switch (player2) {
                        case ROCK:
                        case SPOCK: // and PLAYER2 selects ROCK or SPOCK
                            System.out.print("\tPlayer 1 Wins.");
                            winner = PLAYER1; // Set winner to PLAYER1
                            break;
                        case SCISSORS:
                        case LIZARD: // and PLAYER2 selects SCISSORS or LIZARD
                            System.out.print("\tPlayer 2 Wins.");
                            winner = PLAYER2; // Set winner to PLAYER2
                            break;
                        default:
                    }
                    break;
                case (SCISSORS): // If PLAYER1 selects SCISSORS
                    switch (player2) {
                        case PAPER:
                        case LIZARD: // and PLAYER2 selects PAPER or LIZARD
                            System.out.print("\tPlayer 1 Wins.");
                            winner = PLAYER1; // Set winner to PLAYER1
                            break;
                        case ROCK:
                        case SPOCK: // and PLAYER2 selects ROCK or SPOCK
                            System.out.print("\tPlayer 2 Wins.");
                            winner = PLAYER2; // Set winner to PLAYER2
                            break;
                        default:
                    }
                    break;
                case (LIZARD): // If PLAYER1 selects LIZARD
                    switch (player2) {
                        case PAPER:
                        case SPOCK: // and PLAYER2 selects PAPER or SPOCK
                            System.out.print("\tPlayer 1 Wins.");
                            winner = PLAYER1; // Set winner to PLAYER1
                            break;
                        case ROCK:
                        case SCISSORS: // and PLAYER2 selects ROCK or SCISSORS
                            System.out.print("\tPlayer 2 Wins.");
                            winner = PLAYER2; // Set winner to PLAYER2
                            break;
                        default:
                    }
                    break;
                case (SPOCK): // If PLAYER1 selects SPOCK
                    switch (player2) {
                        case ROCK:
                        case SCISSORS: // and PLAYER2 selects ROCK or SCISSORS
                            System.out.print("\tPlayer 1 Wins.");
                            winner = PLAYER1; // Set winner to PLAYER1
                            break;
                        case PAPER:
                        case LIZARD: // and PLAYER2 selects PAPER or LIZARD
                            System.out.print("\tPlayer 2 Wins.");
                            winner = PLAYER2; // Set winner to PLAYER2
                            break;
                        default:
                    }
                    break;
                default:
                    break;
            }

            if (winner == lastWinner) { // If winner is same as last game:
                consecutiveWins++; // Increase consecutive wins count by one.
            } else {
                consecutiveWins = 1; // Otherwise set consecutive wins to 1.
            }

            lastWinner = winner; // Set lastWinner to winner of this game.

            System.out.println(" " + consecutiveWins + " game winning streak for "
                    + convert(winner)); // Display consecutive wins for winner

        } // end else

        System.out.println();

    } // end play()

} // end class RockPaperScissorsLizardSpock
