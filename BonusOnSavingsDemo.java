
/**
 *              Question 2, Assignment 1, COMP 268
 * Class:       BonusOnSavingsDemo.java
 * Purpose:     Test class BonsOnSavings with provided data.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 7, 2017
 */
public class BonusOnSavingsDemo {

    public static void main(String[] args) {

        BonusOnSavings e1 = new BonusOnSavings("Employee 1"); // Make two instances for each employee.
        BonusOnSavings e2 = new BonusOnSavings("Employee 2"); // Initialize employeeName variables.

        System.out.println("\t" + e1.getEmployeeName()); // Getter used to display employeeName
        System.out.printf("%,8.2f", e1.computeBonus(2000, 5000, 7000, 4000, 8000)); // Actual parameters are provided data.
        printDivider();                            // committment, q1, q2, q3, q4

        System.out.println("\t" + e2.getEmployeeName()); // Getter used to display employeeName
        System.out.printf("%,8.2f", e2.computeBonus(3000, 6000, 9000, 10000, 17000)); // Actual parameters are provided data.
        printDivider();

    } // end main()

    /**
     * Print a page divider, to visually separate displayed information.
     */
    static void printDivider() {
        System.out.println();
        System.out.println("*********************************");
        System.out.println();
    }

} // end class BonusOnSavingsDemo
