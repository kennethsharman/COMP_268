
/**
 *              Question 1, Assignment 2, COMP 268
 * Class:       ReversedSentence.java
 * Purpose:     Provide 3 methods to modify a String, and 1 to ensure the String
 *              is maximum 80 characters in length. Finally, provide method that
 *              builds 3 sentences from a 2 dimensional array.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        February 2, 2017
 */
public class ReversedSentence {

    /**
     * Replace every fifth character, in the String, with the letter z. This
     * applies to letters and spaces. The index starts from position 0, which is
     * not included in the processing.
     *
     * @param s A String data type.
     * @return String
     */
    public static String change5thPosition(String s) {

        for (int i = 1; i < s.length(); i++) { // Startiing with 2nd character:
            if ((i % 5) == 0) { // If character is divisble by 5
                StringBuffer temp = new StringBuffer(s); // Copy String
                temp.setCharAt(i, 'z'); // Replace character with 'z'
                s = new String(temp); // Assign updated String to s 
            }
        }
        return s;
    }

    /**
     * Create a String with the characters from a given 2D array. At the end of
     * each array row; add a carriage return in the String.
     *
     * @param arr Two dimensional character array.
     * @return String
     */
    public static String printChar2DArray(char[][] arr) {
        StringBuilder build = new StringBuilder();
        // Create instance of Stringbuilder

        for (int i = 0; i < 3; i++) { // For each of the 3 rows in 2D array
            for (int j = 0; j < 80; j++) { // Iterate through each character
                build.append(arr[i][j]); // And add it to build variable.
            }
            build.append("\n"); // After processing row, add carriage return.
        }
        return new String(build);
    }

    /**
     * Reverse characters in a given String.
     *
     * @param s String data type.
     * @return String
     */
    public static String reverseByCharacter(String s) {
        StringBuffer temp = new StringBuffer(s); // Create StringBuffer
        temp.reverse(); // Reverse characters.
        return new String(temp);
    }

    /**
     * Reverse order of words, in a given String.
     *
     * @param s String data type.
     * @return String
     */
    public static String reverseByWord(String s) {
        String wordsReversed = ""; // String containing reversed order of words.
        String reversed = reverseByCharacter(s); // Reverse characters in String
        int j = 0; // Index of String
        int lastSpace = -1; // To keep track of last space encountered

        while (j < s.length()) { // For all charcaters in String
            if (reversed.charAt(j) == ' ') { // If character is a space:
                wordsReversed += reverseByCharacter(reversed.substring(lastSpace + 1, j));
                // Reverse all characters in between this space and the last one
                // and add result to wordReversal String
                wordsReversed += " "; // Add a space
                lastSpace = j; // Update last space encountered
            }
            j++; // Move to mext character
        }
        wordsReversed += reverseByCharacter(reversed.substring(lastSpace + 1, s.length()));
        // Reverse letters of last word and add result to wordReversal

        return wordsReversed;
    }

    /**
     * If String length is greater than 80, reduce to first 80 characters
     *
     * @param s String data type.
     * @return String
     */
    public static String truncateSentence(String s) {

        if (s.length() > 80) { // If String length is greater than 80
            s = s.substring(0, 80); // Reduce String to first 80 characters
            System.out.println("Your input has been reduced to: " + s);
            // Notify user
        }
        return s;
    }

} // end class ReversedSentence
