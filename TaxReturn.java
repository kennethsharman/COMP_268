
/**
 *              Question 10, Assignment 1, COMP 268
 * Class:       TaxReturn.java
 * Purpose:     Read code written by someone other than myself and make changes
 *              for desired output.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 29, 2017
 */
import java.util.Scanner;

public class TaxReturn {

    /**
     * Constructs a TaxReturn object for a given income and marital status, and
     * computes the tax.
     *
     * @param anIncome the taxpayer income
     * @param aStatus either SINGLE or MARRIED
     * @param kids number of children
     */
    public TaxReturn(double anIncome, int aStatus, int kids) {
        income = anIncome;
        status = aStatus;
        children = kids; // Initialize children
    }

    public double getTax() {
        double tax;

        if (status == SINGLE_PARENT) { // Is status is single parent:
            status = TaxReturn.SINGLE; // Compute tax as a SINGLE
            income += -(CHILDREN_REDUCTION * children);
            // but with a further reduction of $5000 per child
        }

        switch (status) {
            case SINGLE:
                if (income <= SINGLE_BRACKET1) {
                    tax = RATE1 * income;
                } else if (income <= SINGLE_BRACKET2) {
                    tax = RATE1 * SINGLE_BRACKET1
                            + RATE2 * (income - SINGLE_BRACKET1);
                } else { // If income is > than $51900
                    tax = RATE1 * SINGLE_BRACKET1
                            + RATE2 * (SINGLE_BRACKET2 - SINGLE_BRACKET1)
                            + RATE3 * (income - SINGLE_BRACKET2);
                    if (income > SINGLE_BRACKET4) { // If income > $249,999
                        tax += RATE4 * (income - SINGLE_BRACKET3);
                    } // Then add a tax of 25% on income above $150,000
                }
                break;
            case MARRIED:
                if (income <= MARRIED_BRACKET1) {
                    tax = RATE1 * income;
                } else if (income <= MARRIED_BRACKET2) {
                    tax = RATE1 * MARRIED_BRACKET1
                            + RATE2 * (income - MARRIED_BRACKET1);
                } else {
                    tax = RATE1 * (MARRIED_BRACKET1)
                            + RATE2 * (MARRIED_BRACKET2 - MARRIED_BRACKET1)
                            + RATE3 * (income - MARRIED_BRACKET2);
                    if (income > MARRIED_BRACKET4) { // If income > $349,999
                        tax += RATE5 * (income - MARRIED_BRACKET3);
                    }
                }
                break;
            default:
                // If status is UNKNOWN
                tax = RATE6 * income; // Compute a 33% tax on the income.
                break;
        }

        return tax;
    }

    public static final int SINGLE = 1;
    public static final int MARRIED = 2;
    private static final double RATE1 = 0.15;
    private static final double RATE2 = 0.28;
    private static final double RATE3 = 0.31;
    private static final double SINGLE_BRACKET1 = 21450;
    private static final double SINGLE_BRACKET2 = 51900;
    private static final double MARRIED_BRACKET1 = 35800;
    private static final double MARRIED_BRACKET2 = 86500;
    private double income;
    private int status;

    private int children; // Number of child
    private static final double CHILDREN_REDUCTION = 5000; // Tax Credits
    private static final double MARRIED_BRACKET3 = 200000; // High Income Bracket
    private static final double MARRIED_BRACKET4 = 349999; // High Income Bracket
    private static final double RATE4 = 0.25; // 25% tax
    private static final double RATE5 = 0.35; // 35% tax
    private static final double RATE6 = 0.33; // 33% tax
    private static final double SINGLE_BRACKET3 = 150000; // High Income Bracket
    private static final double SINGLE_BRACKET4 = 249999; // High Income Bracket
    public static final int SINGLE_PARENT = 3; // Single Parent Status
    public static final int UNKNOWN = 4; // Unknown Status

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();

        System.out.print("Enter S (single), M (married), "
                + "or SP (single parent): ");
        String input = in.next();
        int status;

        if (input.equalsIgnoreCase("S")) {
            status = TaxReturn.SINGLE;
        } else if (input.equalsIgnoreCase("M")) {
            status = TaxReturn.MARRIED;
        } else if (input.equalsIgnoreCase("SP")) {
            status = TaxReturn.SINGLE_PARENT;
        } else { // If unacceptable input is received:
            System.out.println("Invalid Input. Your status is set to UNKNOWN");
            status = TaxReturn.UNKNOWN; // status is set to UNKNOWN
        }

        int kids = 0; // Initialize number of kids to zero.
        if (status == TaxReturn.SINGLE_PARENT) { // If status is single parent
            System.out.print("Enter number of children: ");
            kids = in.nextInt(); // then enter in number of children.
        }

        TaxReturn aTaxReturn = new TaxReturn(income, status, kids);

        System.out.println("The tax is " + aTaxReturn.getTax());

    }

} // end class TaxReturn
