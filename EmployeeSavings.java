
/**
 *              Question 5, Assignment 1, COMP 268
 * Class:       EmployeeSavings.java
 * Purpose:     Extend AddressBook.java to include monthly savings, generated at
 *              random, and interest earned on these savings.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 20, 2017
 */
public class EmployeeSavings extends AddressBook {

    private double accountValue = 0; // Account balance, initialized to zero.
    private double[] monthlyInterests; // Array of interests earned per month.
    private double[] monthlySavings; // Savings added to account per month.
    public static final double ANNUAL_INTEREST_RATE = 0.05; // 5% annual interest.

    /**
     * Create a new instance of EmployeeSavings. Calls the constructor from the
     * super class, with only firstName as parameter. Setter from super class is
     * used to initialize lastName.
     *
     * @param fn - First Name. A String data type.
     * @param ln - Last Name. A String data type.
     */
    public EmployeeSavings(String fn, String ln) {
        super(fn); // Call to constructor in super class.
        super.setLastName(ln); // Call to setter in super class.
    }

    /**
     * Create a new instance of EmployeeSavings. Calls the constructor from the
     * super class, with only firstName as parameter. Setter from super class is
     * used to initialize lastName. Monthly Savings, and monthly interests are
     * also initialized.
     *
     * @param fn - First Name. A String data type.
     * @param ln - Last Name. A String data type.
     * @param d1 - Monthly savings. Array of base type double.
     * @param d2 - Monthly interests. Array of base type double.
     */
    public EmployeeSavings(String fn, String ln, double[] d1, double[] d2) {
        super(fn);
        super.setLastName(ln);
        this.monthlySavings = d1;
        this.monthlyInterests = d2;
    }

    /**
     * Retrieve monthlySavings.
     *
     * @return array of type double.
     */
    public double[] getMonthlySavings() {
        return monthlySavings;
    }

    /**
     * Retrieve monthlyInterests.
     *
     * @return array of type double.
     */
    public double[] getMonthlyInterests() {
        return monthlyInterests;
    }

    /**
     * Retrieve accountValue.
     *
     * @return double.
     */
    public double getAccountValue() {
        return accountValue;
    }

    /**
     * Randomly generate savings deposited, for each month in the year, between
     * $100 and $800 dollars. Savings are stored in monthlySavings array.
     *
     * @return monthlySavings array of base type double.
     */
    public double[] generateMonthlySavings() {
        monthlySavings = new double[12]; // Create array with 12 elements.

        for (int i = 0; i < 12; i++) { // For each month:
            monthlySavings[i] = Math.random() * 700 + 100;
        } // Assign value between 100 and 800 to monthly savings element.
        return monthlySavings;
    }

    /**
     * Calculate interest earned on the account balance, at the end of each
     * month.
     *
     * @return monthlyInterests array of base type double.
     */
    public double[] calculateInterests() {
        monthlyInterests = new double[12]; // Create array with 12 elements.

        for (int i = 0; i < 12; i++) { // For each month:
            monthlyInterests[i] = (accountValue + monthlySavings[i]) * (ANNUAL_INTEREST_RATE / 12);
            accountValue += monthlySavings[i] + monthlyInterests[i];
        } // Add monthly savings to account balance. Multiply this by 5% to
        // determine interest earned. Add this interest to account balance.
        return monthlyInterests;
    }

    /**
     * Create a String that includes the first and last name of the employee,
     * along with the amount saved in 1 year.
     *
     * @param arr - array of EmployeeSavings.
     * @return String of employee names and yearly savings.
     */
    public static String getReport(EmployeeSavings[] arr) {
        String output = ""; // Initialize return String.

        int month = 1; // Number used to represent the month of the year.
        for (EmployeeSavings employee : arr) {
            output = output.concat(String.format("%3s", month + " "));
            output = output.concat(String.format("%-25s", employee.getFirstName()
                    + " " + employee.getLastName() + " saved:"));
            output = output.concat("$");
            output = output.concat(String.format("%,1.2f", employee.getAccountValue()));
            output = output.concat("\n");
            month++;
        } // Build-up a String containing each employee name and amount saved.

        return output;

    } // end printSummary

} // end class EmployeeSavings

