
/**
 *              Question 8, Assignment 1, COMP 268
 * Class:       Candidate.java
 * Purpose:     Extend AddressBook class to store additional data, which is used
 *              to determine recruitment eligibility.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 27, 2017
 */
import java.util.ArrayList; // Make ArrayList available

public class Candidate extends AddressBook {

    private boolean innovation; // brillliant = true, average = false
    private double grade; // Average final marks in bachelor's degree
    private double regulation; // Ability to regulate one's own skill probabilty
    private String communication; // Ability to communicate

    /**
     * Create instance of Candidate. Initializes first and last name with calls
     * to the super class. All instance variables explicit to Candidate.java are
     * initialized.
     *
     * @param fn String data type.
     * @param ln String data type.
     * @param grade double data type.
     * @param comm String data type.
     * @param innov boolean data type.
     * @param reg double data type.
     */
    public Candidate(String fn, String ln, double grade, String comm,
            boolean innov, double reg) {
        super(fn);
        super.setLastName(ln);
        this.grade = grade;
        this.communication = comm;
        this.innovation = innov;
        this.regulation = reg;
    }

    /**
     * Retrieve value of innovation
     *
     * @return boolean
     */
    public boolean isInnovative() {
        return innovation;
    }

    /**
     * Retrieve grade
     *
     * @return double
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Retrieve regulation
     *
     * @return double
     */
    public double getRegulation() {
        return regulation;
    }

    /**
     * Retrieve communication
     *
     * @return String
     */
    public String getCommunication() {
        return communication;
    }

    /**
     * Set the value of communication
     *
     * @param comm String data type.
     */
    public void setCommunication(String comm) {
        this.communication = comm;
    }

    /**
     * Set the value of grade
     *
     * @param grade double data type.
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * Set the value of innovation
     *
     * @param innov boolean data type.
     */
    public void setInnovation(boolean innov) {
        this.innovation = innov;
    }

    /**
     * Set the value of regulation
     *
     * @param reg double data type.
     */
    public void setRegulation(double reg) {
        this.regulation = reg;
    }

    /**
     * The method is passed an array of Candidate instances. For each instance
     * there is a series of eligibility requirements that must be fulfilled in
     * order to be considered by company. If the particular instance meets the
     * requirements, then it is added to an ArrayList (eligibleList).
     *
     * @param cands Array base type Candidate[]
     * @return ArrayList of base type Candidate
     */
    public static ArrayList<Candidate> getEligibleCandidates(Candidate[] cands) {
        ArrayList<Candidate> eligibleList = new ArrayList<>(); // Create new instance of ArrayList

        for (Candidate cand : cands) { // For each candidate
            if (cand.getGrade() >= 85.0) { // If grades are at least 85%
                if (!cand.getCommunication().equals("poor")) // and COMM is not poor
                {
                    eligibleList.add(cand); // Then eligiable
                } else if (cand.isInnovative() == true) { // If grades at least 85%, COMM is poor, but innov is brilliant
                    eligibleList.add(cand); // Then eligible
                }
            }
            if (cand.getGrade() < 85.0) { // Grades are less than 85%
                if (cand.getRegulation() >= 0.5 && !cand.getCommunication().equals("poor")) {
                    // regulation is at least 0.5 and communication is not poor    
                    eligibleList.add(cand); // Then eligible
                }
            }
        } // end for loop

        return eligibleList;

    } // end getEligibleCandidates

} // end class Candidate
