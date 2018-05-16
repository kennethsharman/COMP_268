
/**
 *              Question 6, Assignment 2, COMP 268
 * Class:       WeekDayDemo.java
 * Purpose:     Utilize WeekDay class to determine weekday for any date between
 *              March 1900 and February 2100.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        February 20, 2017
 */
import java.util.Scanner; // Import Scanner class.

public class WeekDayDemo {

    static Scanner stdin = new Scanner(System.in); // Create instance of Scanner
    static int day, month, year; // Integer values for month, day, and year.
    static String input; // String value of user input.

    public static void main(String[] args) {
        WeekDay date = new WeekDay(); // Create new instance of WeekDay.

        while (true) { // Loop runs until user terminates program in runAgain().
            printWelcome(); // Display title bar.
            getYear(); // User input assings value to year variable.
            getMonth(); // User input assigns value to month variable.
            getDay(); // User input assigns value to day variable.
            System.out.print(month + "." + day + "." + year + " is a ");
            System.out.println(date.getWeekDay(day, month, year));
            // Display weekday with getWeekDay instance method from WeekDay.java
            runAgain(); // User input either terminates program, or evaluates
            // another date.
        }

    } // end of main()

    /**
     * Method displays title bar.
     */
    public static void printWelcome() {

        System.out.println("*******************************************");
        System.out.println("\tWEEKDAY CALCULATOR");
        System.out.println("*******************************************");

    } // end printWelcome

    /**
     * User input is assigned to year variable. If input is not an integer in
     * range [1900,2100], user is prompted to re-enter value.
     */
    public static void getYear() {

        while (true) { // Loop runs until acceptable input is assigned to year.
            System.out.println("Please enter year:");
            System.out.print("? ");
            input = stdin.nextLine(); // Read input as String data type.

            try {
                year = Integer.parseInt(input);
                // Convert String to integer, and assign to year variable.
                if (year >= 1900 && year <= 2100) { // If within stated range
                    break; // Input is accetable.
                } else { // If outside stated range, input is unacceptable.
                    System.out.println("Year must be in range [1900, 2100].");
                }
            } catch (NumberFormatException e) {
                // If input cannot be converted to String, input is unacceptable.
                System.out.println("Not a valid year.");
            }

        } // end while loop

    } // end getYear

    /**
     * User input is assigned to month variable. If input is not an integer in
     * range [1,12], user is prompted to re-enter value. If the year is 1900 and
     * month is 1 or 2, user is prompted to re-enter value. If the year is 2100
     * and then month is later than 2, user is prompted to re-enter value.
     */
    public static void getMonth() {

        OUTER:
        while (true) { // Loop runs until acceptable input is assigned to month.
            System.out.println("Please enter month, expressed as integer:");
            System.out.print("? ");
            input = stdin.nextLine(); // Read input as String data type.
            try {
                month = Integer.parseInt(input);
                if (month > 0 && month < 13) {
                    // If month is in range [1,12]
                    switch (year) {
                        case 1900: // If the year is 1900
                            if (month >= 3) { // and month is later than Feb.
                                break OUTER; // Input is acceptable.
                            } else { // Otherwise, date is outside of range.
                                System.out.println("Date must be between March"
                                        + " 1900 and February 2100.");
                            }
                            break;
                        case 2100: // If the year is 2100
                            if (month <= 2) { // and month is earlier than March
                                break OUTER; // Input is acceptable.
                            } else { // Otherwise, date is outside of range.
                                System.out.println("Date must be between March"
                                        + " 1900 and February 2100.");
                            }
                            break;
                        default: // For all othr years, month is in range [1,12]
                            break OUTER;
                    }
                } else { // If month is invalid, input is unacceptable.
                    System.out.println("Not a valid month.");
                }
            } catch (NumberFormatException e) {
                // If input cannot be converted to String, input is unacceptable
                System.out.println("Not a valid month.");
            }

        } // end while loop

    } // end getMonth

    /**
     * User input is assigned to day variable. If input is not an integer user
     * is prompted to re-enter value. If day is outside range of a particular
     * month, user is prompted to re-enter value. Feb. 29 is included when year
     * corresponds to a leap year.
     */
    public static void getDay() {

        boolean isLeapYear = false;

        if ((year % 4 == 0) && year % 100 != 0) { // If year is divisible by 4
            // and not divisible by 100 then it is a leap year.
            isLeapYear = true;
        } else if (year % 400 == 0) { // Else if year is divisible by 400 then
            isLeapYear = true; // it is a leap year.
        }

        BIG_LOOP:
        while (true) { // Loop runs until acceptable input is assigned to day.
            System.out.println("Please day of month, expressed as integer:");
            System.out.print("? ");
            input = stdin.nextLine(); // Read input as String data type.
            try {
                day = Integer.parseInt(input); // We know have integer
                if (day > 0) { // If day is a positive integer:
                    switch (month) { // and the month is
                        case 1: // January
                        case 3: // March
                        case 5: // May
                        case 7: // July
                        case 8: // August
                        case 10: // October
                        case 12: // or December (all months with 31 days)
                            if (day <= 31) { // Range is [1,31]
                                break BIG_LOOP; // Input is acceptable.
                            } else { // if day > 31 then it is invalid.
                                System.out.println("Date out of Range");
                            }
                            break;
                        case 4: // is month is April,
                        case 6: // June,
                        case 9: // September,
                        case 11: // or November (all months with 30 days)
                            if (day <= 30) { // Range is [1,30]
                                break BIG_LOOP; // Input is acceptable.
                            } else { // If day > 30 then it is invalid.
                                System.out.println("Date out of Range");
                            }
                            break;
                        case 2: // If month is Febuary
                            if (isLeapYear == false) { // and not a leap year
                                if (day <= 28) { // Range is [1,28]
                                    break BIG_LOOP; // Input is acceptable.
                                } else { // If day > 28 then it is invalid.
                                    System.out.println("Date out of Range");
                                }
                            } else { // if it is a leap year
                                if (day <= 29) { // Range is [1,29]
                                    break BIG_LOOP; // Input is acceptable.
                                } else { // If day > 29 then it is invalid.
                                    System.out.println("Date out of Range");
                                }
                            }
                    } // end switch
                } else { // If day is negative input is unacceptable.
                    System.out.println("Day must be positive integer.");
                }
            } catch (NumberFormatException e) {
                // If input cannot be converted to String, input is unacceptable
                System.out.println("Not a valid day.");
            }

        } // end while loop

    } // end getDay

    /**
     * User input determines whether or not to terminate program.
     */
    public static void runAgain() {

        System.out.println("\n*******************************************");
        System.out.println("Press \"y\" or \"Y\" to calculate another date.");
        System.out.println("Any other key will end program.");
        // User is asked if they wish to calculate another date.
        System.out.print("? ");
        input = stdin.nextLine(); // User input is entered.

        switch (input) {
            case ("Y"):
            case ("y"):
                break; // User indicated they do not wish to terminate program.
            default: // Other wise the program is terminated.
                System.out.println("END WEEKDAY CALCULATOR");
                System.exit(0);
        }

    } // end runAgain

} // end class WeekDayDemo
