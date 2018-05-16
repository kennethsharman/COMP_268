
/**
 *              Question 1, Assignment 2, COMP 268
 * Class:       ReversedSentenceDemo.java
 * Purpose:     User inputs 3 sentences. Methods from ReversedSentence.java are
 *              used to modify the sentences, then each sentence is store in a
 *              row of a 2D character array. Contents of array are displayed.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        February 2, 2017
 */
import java.util.Scanner; // Make Scanner class available.

public class ReversedSentenceDemo {

    static char[][] charArray = new char[3][80]; // 3x80 charcater array

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in); // Create Scanner

        System.out.println("Enter first sentence (maximum 80 characters)");
        String s1 = stdin.nextLine(); // Input first sentence
        s1 = ReversedSentence.truncateSentence(s1); // Reduce to max 80 char.
        s1 = ReversedSentence.reverseByCharacter(s1); // Reverse character order
        loadSentence(s1, 0); // Assign each character of the sentence to an 
        // element in first row of the character array

        System.out.println("\nEnter second sentence (maximum 80 characters)");
        String s2 = stdin.nextLine(); // Input second sentence
        s2 = ReversedSentence.truncateSentence(s2); // Reduce to max 80 char.
        s2 = ReversedSentence.reverseByWord(s2); // Reverse word order.
        loadSentence(s2, 1); // Assign each character of the sentence to an 
        // element in second row of the character array

        System.out.println("\nEnter third sentence (maximum 80 characters)");
        String s3 = stdin.nextLine(); // Input third sentence.
        s3 = ReversedSentence.truncateSentence(s3); // Reduce to max 890 char.
        s3 = ReversedSentence.change5thPosition(s3); // Modify sentence
        loadSentence(s3, 2); // Assign each character of the sentence to an 
        // element in third row of the character array

        System.out.println("\n****************************************\n");
        System.out.println(ReversedSentence.printChar2DArray(charArray));
        System.out.println("****************************************");
        // Print character array

    } // end of main()

    /**
     * Iterate through characters of String and assign each to "ith" row element
     * of character array
     *
     * @param s String
     * @param i int data type, representing row of character array
     */
    static void loadSentence(String s, int i) {
        for (int j = 0; j < s.length(); j++) { // For each character of String
            charArray[i][j] = s.charAt(j); // Assign value to array element
        }
    }

} // end class ReversedSentence
