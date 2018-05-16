
/**
 *              Question 5, Assignment 1, COMP 268
 * Class:       EmployeeSavingsDemo.java
 * Purpose:     Create an array of EmployeeSavings elements. Display a summary
 *              of amount saved for each employee. Give user an option to see
 *              breakdown of savings, throughout the course of 12 months.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 20, 2017
 */
import java.util.Scanner; // Make Scanner class available.

public class EmployeeSavingsDemo {

    static String input; // User input
    static Scanner stdin = new Scanner(System.in); // Create instance of Scanner.

    public static void main(String[] args) {

        EmployeeSavings[] employees = new EmployeeSavings[15]; // Create array of 15 employees

        employees[0] = new EmployeeSavings("Elena", "Brandon"); // Construct each instance with provided data. 
        employees[1] = new EmployeeSavings("Thomas", "Molson");
        employees[2] = new EmployeeSavings("Hamilton", "Winn");
        employees[3] = new EmployeeSavings("Suzie", "Sarandin");
        employees[4] = new EmployeeSavings("Philip", "Winne");
        employees[5] = new EmployeeSavings("Alex", "Trebok");
        employees[6] = new EmployeeSavings("Emma", "Pivoto");
        employees[7] = new EmployeeSavings("John", "Lenthen");
        employees[8] = new EmployeeSavings("James", "Lean");
        employees[9] = new EmployeeSavings("Jane", "Ostin");
        employees[10] = new EmployeeSavings("Emily", "Car");
        employees[11] = new EmployeeSavings("Daniel", "Hamshire");
        employees[12] = new EmployeeSavings("Neda", "Bazdar");
        employees[13] = new EmployeeSavings("Aaron", "Smith");
        employees[14] = new EmployeeSavings("Kate", "Hen");

        for (EmployeeSavings employee : employees) {
            employee.generateMonthlySavings();
            employee.calculateInterests();
        } // For each employee; generate saving amounts, calculate the interest

        System.out.println(EmployeeSavings.getReport(employees));
        // Display name and amount saved for each employee.
        System.out.println("\nView Detailed Report?");
        processInput(); // Evaluate user input.
        printReport(employees); // Display employee(s) information- if requested.

    } // end main()

    /**
     * Get input from the user.
     */
    static void processInput() {
        OUTER: // while loop label
        while (true) {
            input = stdin.nextLine(); // Get input
            switch (input) {
                case "y":
                case "Y":
                    break OUTER; // If yes the while loop is broken
                case "n":
                case "N":
                    System.out.println("Goodbye!");
                    System.exit(0); // If no, the program is terminated.
                default:
                    System.out.println("Invalid Input.");
                    System.out.println("Please eneter \"y\", \"Y\", \"n\", or \"N\" ");
                    break; // If unexpected inout is encountered, the loop runs again.
            } // end switch
        } // end while loop
    } // end processInput

    /**
     * printReport decides, based on user input, which employee details are to
     * be printed using a switch statement. printDetails() is passed the
     * appropriate instance.
     *
     * @param employees An array of EmployeeSavings
     */
    static void printReport(EmployeeSavings[] employees) {

        System.out.println("Please enter employee number: ");

        OUTER: // while loop label
        while (true) {
            input = stdin.nextLine(); // Get input
            switch (input) {
                case "1":
                    printDetails(employees[0]);
                    break;
                case "2":
                    printDetails(employees[1]);
                    break;
                case "3":
                    printDetails(employees[2]);
                    break;
                case "4":
                    printDetails(employees[3]);
                    break;
                case "5":
                    printDetails(employees[4]);
                    break;
                case "6":
                    printDetails(employees[5]);
                    break;
                case "7":
                    printDetails(employees[6]);
                    break;
                case "8":
                    printDetails(employees[7]);
                    break;
                case "9":
                    printDetails(employees[8]);
                    break;
                case "10":
                    printDetails(employees[9]);
                    break;
                case "11":
                    printDetails(employees[10]);
                    break;
                case "12":
                    printDetails(employees[11]);
                    break;
                case "13":
                    printDetails(employees[12]);
                    break;
                case "14":
                    printDetails(employees[13]);
                    break;
                case "15":
                    printDetails(employees[14]);
                    break;
                default: // If input was not 1-15 error message is displayed. 
                    System.out.println("Invliad Input. Please enter 1-15");
            } // end switch.
            // Weather or not a detailed report was printed the user is asked
            // if they want to view another report.
            System.out.println("View another Detailed Report?");
            processInput();
        } // end while loop
    } // end printReport

    /**
     * Display breakdown of employees account. Includes; savings deposited,
     * interest earned, and updated account balance for each month. Total
     * savings for the year is returned as a String.
     *
     * @param employee instance of EmployeeSavings.
     */
    public static void printDetails(EmployeeSavings employee) {

        double[] monthlySavings = employee.getMonthlySavings();
        // Assign monthly savings of employee to an array.
        double[] monthlyInterests = employee.getMonthlyInterests();
        // Assign monthly interests of employee to an array.
        double balance = 0; // Initialize account balance to zero.

        System.out.println();
        System.out.print("\t");
        System.out.println(employee.getFirstName() + " " + employee.getLastName());
        // Print firstName and lastName of employee.
        System.out.printf("%-7s", "Month"); // Heading for displayed table.
        System.out.printf("%-9s", "Deposit");
        System.out.printf("%-10s", "Interest");
        System.out.printf("%-9s", "Balance");
        System.out.println();

        int month = 1; // Initialize month to start at zero.
        for (int i = 0; i < 12; i++) {
            balance += monthlySavings[i] + monthlyInterests[i];
            // Account balance get updated to include current month savings
            // and interest earned.

            System.out.printf("%-7s", month); // Display month number.
            System.out.print("$");
            System.out.printf("%1.2f", monthlySavings[i]); // Display amount saved.
            System.out.printf("%-2s", ""); // Spacer to align columns.
            System.out.print("$");
            System.out.printf("%5.2f", monthlyInterests[i]); // Display interest earned.
            System.out.printf("%-4s", ""); // Spacer to align columns.
            System.out.print("$");
            System.out.printf("%,8.2f", balance); // Display updated account balance.
            System.out.println();

            month++; // Change to following month for next loop of printouts.
        }

        System.out.print("\n" + employee.getFirstName() + " saved $");
        System.out.printf("%,1.2f", employee.getAccountValue());
        System.out.println(); // DIsplay name and amount saved.

    } // end printDetails

} // end class EmployeeSavingsDemo

