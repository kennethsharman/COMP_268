
/**
 *              Question 8, Assignment 1, COMP 268
 * Class:       CandidateDemo.java
 * Purpose:     Test Candidate.java class with provided instance data. Display
 *              list of eligible candidates for recruitment process.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 27, 2017
 */
public class CandidateDemo {

    public static void main(String[] args) {

        Candidate[] cands = new Candidate[15]; // Create array of Runners.
        // Initialize each instance with provided data.
        cands[0] = new Candidate("Elena", "Brandon", 82.30, "poor", true, 0.5);
        cands[1] = new Candidate("Thomas", "Molson", 85.10, "poor", false, 1.0);
        cands[2] = new Candidate("Hamilton", "Winn", 77.77, "average", false, 0.8);
        cands[3] = new Candidate("Suzie", "Sarandin", 69.93, "average", false, 0.0);
        cands[4] = new Candidate("Philip", "Winne", 93.03, "average", true, 1.0);
        cands[5] = new Candidate("Alex", "Trebok", 88.61, "poor", true, 0.7);
        cands[6] = new Candidate("Emma", "Pivoto", 55.99, "excellent", false, 0.8);
        cands[7] = new Candidate("John", "Lenthen", 87.49, "excellent", true, 0.9);
        cands[8] = new Candidate("James", "Lean", 88.00, "excellent", false, 0.5);
        cands[9] = new Candidate("Jane", "Ostin", 91.20, "average", true, 0.6);
        cands[10] = new Candidate("Emily", "Car", 66.79, "excellent", false, 0.3);
        cands[11] = new Candidate("Daniel", "Hamshire", 76.65, "average", true, 0.2);
        cands[12] = new Candidate("Neda", "Bazdar", 55.89, "excellent", true, 0.5);
        cands[13] = new Candidate("Aaron", "Smith", 90.01, "excellent", false, 0.3);
        cands[14] = new Candidate("Kate", "Hen", 87.90, "poor", false, 0.8);

        System.out.println("The Candidates have been initialized as follows:");
        printCandidates(cands); // Display provided data for each candidate.

        System.out.println("* Eligible Candidates for Google Inc. Recuitment *");
        int i = 1; // Numbering for eligible Candidate
        for (Candidate eligible : Candidate.getEligibleCandidates(cands)) {
            // For each candidate that meets the recruitment requirements
            System.out.printf("%-3s", i);
            System.out.println(eligible.getFirstName() + " "
                    + eligible.getLastName()); // Display first and last name
            i++; // Increase numbering for next eligible candidate.
        }

    } // end of main()

    /**
     * Display provided data for each instance with formatted output.
     *
     * @param cands Array of base type Candidate
     */
    static void printCandidates(Candidate[] cands) {
        System.out.println();
        System.out.printf("%-17s", "NAME");
        System.out.printf("%-7s", "GRADE");
        System.out.printf("%-11s", "COMM.");
        System.out.printf("%-12s", "INNOVATION");
        System.out.println("REGULATORY PROB.");
        for (Candidate cand : cands) {
            //Regulatory Prob.
            System.out.printf("%-17s", cand.getFirstName() + " "
                    + cand.getLastName());
            System.out.printf("%-7.2f", cand.getGrade());
            System.out.printf("%-11s", cand.getCommunication());
            if (cand.isInnovative() == true) { // If innovation is set to true:
                System.out.printf("%-12s", "brilliant"); // Print "brilliant"
            } else { // "Otherwise print "average"
                System.out.printf("%-12s", "average");
            }
            System.out.println(cand.getRegulation());
        }
        System.out.println();
    }

} // end class CandidateDemo
                                 