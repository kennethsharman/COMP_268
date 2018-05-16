
/**
 *              Question 2, Assignment 1, COMP 268
 * Class:       BonusOnSavings.java
 * Purpose:     Calculate Employee Bonus, given employee data.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 7, 2017
 */
public class BonusOnSavings {

    final private String employeeName;

    /**
     * Create a new instance of class BonusOnSavings. Initialize instance
     * employeeName variable to value of argument passed through constructor
     * parameter.
     *
     * @param employeeName String
     */
    public BonusOnSavings(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * Return employeeName.
     *
     * @return employeeName - type String
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Value of employee bonus is determined by comparing savings to quarterly
     * and annual committed savings.
     *
     * @param commitment double - monthly committed savings.
     * @param q1 double - savings from 1st Quarter.
     * @param q2 double - savings from 2nd Quarter.
     * @param q3 double - savings from 3rd Quarter.
     * @param q4 double - savings from 4th Quarter.
     * @return bonus - type double
     */
    public double computeBonus(double commitment, double q1, double q2,
            double q3, double q4) {

        double quartlyMinimum = 3 * commitment; // 3 months of committed savings
        double annualMinimum = 12 * commitment; //12 months of committed savings
        double annualSavings = q1 + q2 + q3 + q4; // sum of quarterly savings
        double bonus = 0; // initialize bonus to $0

        System.out.println("\nBONUS BREAKDOWN");

        System.out.printf("%-24s", "Quarter 1 bonus:");
        System.out.print("$");

        if (q1 >= quartlyMinimum) { // Determine if 1st quarter bonus is eligable.
            bonus += (0.03 * q1); // If egliable, add to bonus amount.
            System.out.printf("%,8.2f", (0.03 * q1));
        } else {
            System.out.printf("%8.2f", 0.0);
        }
        System.out.println();

        System.out.printf("%-24s", "Quarter 2 bonus:");
        System.out.print("$");
        if (q2 >= quartlyMinimum) { // Determine if 2nd quarter bonus is eligable.
            bonus += (0.03 * q2); // If egliable, add to bonus amount.
            System.out.printf("%,8.2f", (0.03 * q2));
        } else {
            System.out.printf("%8.2f", 0.0);
        }
        System.out.println();

        System.out.printf("%-24s", "Quarter 3 bonus:");
        System.out.print("$");
        if (q3 >= quartlyMinimum) { // Determine if 3rd quarter bonus is eligable.
            bonus += (0.03 * q3); // If egliable, add to bonus amount.
            System.out.printf("%,8.2f", (0.03 * q3));
        } else {
            System.out.printf("%8.2f", 0.0);
        }
        System.out.println();

        System.out.printf("%-24s", "Quarter 4 bonus:");
        System.out.print("$");
        if (q4 >= quartlyMinimum) { // Determine if 4th quarter bonus if eligable.
            bonus += (0.03 * q4); // If egliable, add to bonus amount.
            System.out.printf("%,8.2f", (0.03 * q4));
        } else {
            System.out.printf("%8.2f", 0.0);
        }
        System.out.println();

        System.out.printf("%-24s", "Annual bonus:");
        System.out.print("$");
        if (annualSavings >= annualMinimum) { // Determine if annual bonus is eligable.
            bonus += (0.05 * annualSavings); // If egliable, add to bonus amount.
            System.out.printf("%,8.2f", (0.05 * annualSavings));
        } else {
            System.out.printf("8.2f", 0.0);
        }
        System.out.println();

        System.out.printf("%-24s", "Additional bonus:");
        System.out.print("$");
        if (annualSavings >= (annualMinimum * 1.25)) { // Determine if additional bonus is eligable
            bonus += (annualSavings - (annualMinimum * 1.25)); // If egliable, add to bonus amount.
            System.out.printf("%,8.2f", annualSavings - annualMinimum * 1.25);
        } else {
            System.out.printf("%8.2f", 0.0);
        }
        System.out.println();
        System.out.println();
        System.out.printf("%-24s", "Total Bonus:");
        System.out.print("$");
        return bonus;
    }

} // end class BonusOnSavings
