
/**
 *              Question 4, Assignment 1, COMP 268
 * Class:       BanffMarathonRunnerDemo.java
 * Purpose:     Create instances for each runner, with data provided in
 *              question. Display winner and runner up. Calculate and display
 *              the average race time of the runners. Finally, print name and
 *              numbers of years participated if runner had a race time that was
 *              at least as good as the average.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 13, 2017
 */
public class BanffMarathonRunnerDemo {

    public static void main(String[] args) {

        BanffMarathonRunner[] runners = new BanffMarathonRunner[15]; // Create array of Runners.

        runners[0] = new BanffMarathonRunner("Elena", "Brandon", 341, 1); // Initialize each instance with provided data. 
        runners[1] = new BanffMarathonRunner("Thomas", "Molson", 273, 2);
        runners[2] = new BanffMarathonRunner("Hamilton", "Winn", 278, 5);
        runners[3] = new BanffMarathonRunner("Suzie", "Sarandin", 329, 7);
        runners[4] = new BanffMarathonRunner("Philip", "Winne", 445, 9);
        runners[5] = new BanffMarathonRunner("Alex", "Trebok", 275, 3);
        runners[6] = new BanffMarathonRunner("Emma", "Pivoto", 275, 4);
        runners[7] = new BanffMarathonRunner("John", "Lenthen", 243, 1);
        runners[8] = new BanffMarathonRunner("James", "Lean", 334, 1);
        runners[9] = new BanffMarathonRunner("Jane", "Ostin", 412, 1);
        runners[10] = new BanffMarathonRunner("Emily", "Car", 393, 4);
        runners[11] = new BanffMarathonRunner("Daniel", "Hamshire", 299, 4);
        runners[12] = new BanffMarathonRunner("Neda", "Bazdar", 343, 3);
        runners[13] = new BanffMarathonRunner("Aaron", "Smith", 317, 6);
        runners[14] = new BanffMarathonRunner("Kate", "Hen", 265, 8);

        setHomeAddress(runners); // Set everyones address to "Private".

        BanffMarathonRunner winner = BanffMarathonRunner.getFastestRunner(runners); // Compute winnder.
        System.out.println("\t1st PLACE");
        printRunner(winner); // Display information of winner.

        BanffMarathonRunner runnerUp = BanffMarathonRunner.getSecondFastestRunner(runners); // Compute runner up.
        System.out.println("\t2nd PLACE");
        printRunner(runnerUp); // Display information of runner up.

        System.out.print("(Runner up was ");
        System.out.print(runnerUp.getTime() - winner.getTime()); // Calculate and display difference in race times.
        System.out.println(" min behind the winner)");
        System.out.println();

        printAverageTime(runners); // Display average race time, for all runners.

        System.out.println("Runners with average or better than average times:");
        System.out.println(BanffMarathonRunner.getAboveAverageRunners(runners));
        // Display list of runners with average or better race times.

    } // end of main()

    /**
     * Set the value of homeAddress to "Private" for all runners in array.
     *
     * @param runners - Array of BanffMarathonRunner
     */
    static void setHomeAddress(BanffMarathonRunner[] runners) {
        for (BanffMarathonRunner runner : runners) {
            runner.setHomeAddress("Private"); // Setter from superclass AddressBook.java
        }
    }

    /**
     * Display name, address, and race time for runner, passed as actual
     * parameter.
     *
     * @param runner - Instance of BanffMarathonRunner.
     */
    static void printRunner(BanffMarathonRunner runner) {

        System.out.printf("%-25s", "Name:");
        System.out.println(runner.getFirstName() + " " + runner.getLastName()); // Getter from AdressBook.java
        System.out.printf("%-25s", "Home Address:");
        System.out.println(runner.getHomeAddress()); // Getter from AdressBook.java
        System.out.printf("%-25s", "Time (min.):");
        System.out.println(runner.getTime()); // Getter from BanffMarathonRunner.java
        System.out.println();

    } // end printRunner.

    /**
     * Display average race time of all runners in the array.
     *
     * @param runners - Array of BanffMarathonRunner.
     */
    static void printAverageTime(BanffMarathonRunner[] runners) {

        System.out.printf("%-25s", "Average time (min.):");
        System.out.printf("%1.2f", BanffMarathonRunner.getAverageTime(runners)); // Compute and display average race time.
        System.out.println();
        System.out.println();
    }

} // end class BanffMarathonRunnerDemo
