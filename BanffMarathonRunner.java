
/**
 *              Question 4, Assignment 1, COMP 268
 * Class:       BanffMarathonRunner.java
 * Purpose:     Extend AddressBook.java to include marathon race data. Includes
 *              methods to determine winner, runner up, average race time, and
 *              list of runners that completed the race with at least average
 *              race times.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 13, 2017
 */
public class BanffMarathonRunner extends AddressBook {

    private int time; // Race time.
    private int years; // Years participated in marathon.

    /**
     * Create a new instance of BanffMarathonRunner. Calls a constructor from
     * the superclass AddressBook, initializing firstName. lastName is set,
     * using setter method from super class. Both instance variables, time and
     * years are assigned to parameters.
     *
     * @param fn - First Name A String data type.
     * @param ln - Last Name of runner. A String data type
     * @param min - Race time. An integer data type.
     * @param yr - Years participated in marathon. An integer data type.
     */
    public BanffMarathonRunner(String fn, String ln, int min, int yr) {
        super(fn);
        super.setLastName(ln);
        this.time = min;
        this.years = yr;
    }

    /**
     * Retrieve the value of time.
     *
     * @return An integer data type.
     */
    public int getTime() {
        return this.time;
    }

    /**
     * Retrieve the value of years.
     *
     * @return An integer data type.
     */
    public int getYears() {
        return this.years;
    }

    /**
     * Set the value of time.
     *
     * @param time An integer type variable.
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * Set the value of years.
     *
     * @param years An integer type variable.
     */
    public void setYears(int years) {
        this.years = years;
    }

    /**
     * Determine the winner of the race. Assume that the first runner in the
     * array has the fastest time. For each of the runners, compare race times.
     * If a given runner has a faster time, then he/ she has fastest time.
     *
     * @param runners - Array of BanffMarathonRunner elements.
     * @return - instance of BanffMarathonRunner with smallest race time.
     */
    public static BanffMarathonRunner getFastestRunner(BanffMarathonRunner[] runners) {

        BanffMarathonRunner fastestRunner = runners[0]; // Initialize fastestRunner to first element.

        for (BanffMarathonRunner runner : runners) { // cycle through each instance.
            if (runner.getTime() < fastestRunner.getTime()) {
                fastestRunner = runner; // If given time is smaller, it becomes new fastest time.
            }
        }
        return fastestRunner;
    } // end getFastestRunner

    /**
     * Determine the runner up by cycling through all race times. Adjust the
     * fastest and second fastest after each element is read.
     *
     * @param runners - Array of BanffMarathon elements.
     * @return - Instance with second smallest race time value.
     */
    public static BanffMarathonRunner getSecondFastestRunner(BanffMarathonRunner[] runners) {

        BanffMarathonRunner fastestRunner = runners[0]; // Initialize fastestRunner to first element.
        BanffMarathonRunner secondFastest; // Runner with second fastest time.

        if (BanffMarathonRunner.getFastestRunner(runners).getTime() == runners[0].getTime()) {
            secondFastest = runners[1]; // If winner is first element, set runner up to second element.
        } else {
            secondFastest = runners[0]; // If winner is not first element, set runner up to first element.
        }
        for (BanffMarathonRunner runner : runners) {
            if (runner.getTime() < fastestRunner.getTime()) { // If given time is smaller than anything read so far:
                secondFastest = fastestRunner; // Previous fastest time becomes second fastest.
                fastestRunner = runner; // Given time becomes fastest.
            } else if (runner.getTime() < secondFastest.getTime() && !runner.equals(runners[0])) {
                secondFastest = runner;
            } // Otherwise if given time is smaller than current runner up, and not the first element, update current second fastest time.
        }
        return secondFastest;
    } // end getSecondFastestRunner

    /**
     * Calculate the average race time of all runners.
     *
     * @param runners - Array of BanffMarathon elements.
     * @return - A double data type.
     */
    public static double getAverageTime(BanffMarathonRunner[] runners) {
        int totalTime = 0; // Sum of runners times.
        double averageTime; // Average race times for all runners.
        int count = 0; // Number of runners processed.

        for (BanffMarathonRunner runner : runners) {
            totalTime += runner.getTime(); // For each element read, add time to total.
            count++; // For each element read, increase count by one.
        }
        averageTime = (double) totalTime / count; // Calculate average race time.
        return averageTime;
    } // end getAverageTime

    /**
     * Create a list of runners, with years participated, that have at least
     * average race times.
     *
     * @param runners - Array of BanffMarahtonRunner elements.
     * @return - A String data value.
     */
    public static String getAboveAverageRunners(BanffMarathonRunner[] runners) {
        String string = ""; // Initialize String to be returned.
        for (BanffMarathonRunner runner : runners) {

            if (runner.getTime() <= BanffMarathonRunner.getAverageTime(runners)) { // If the runner's race time was at least as good as the average.
                string = string.concat(runner.getFirstName() + " "); // Add their name and years partiici[ated to the string.
                string = string.concat(runner.getLastName() + "\t");
                string = string.concat("- Participated " + runner.getYears());
                string = string.concat(" years.\n");
            }
        }
        return string;
    } // end getAboveAverageRunners

} // end class BanffMarathonRunner
