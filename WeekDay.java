
/**
 *              Question 6, Assignment 2, COMP 268
 * Class:       WeekDay.java
 * Purpose:     To provide the variables and a method which can be used to find
 *              the weekday of any date since the start of 1900.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        February 20, 2017
 */
public class WeekDay {

    private int numberOfDays; // Number of days since start of year 1900.
    public static final int MONDAY = 1; // Weekdays are assigned numeric values
    public static final int TUESDAY = 2; // corresponding to weekly calendar
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 0; // Sunday is zero-ith day of week.
    public static final int JANUARY = 1; // Months are assigned numeric values
    public static final int FEBRUARY = 2; // corresponding to calendar position.
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    /**
     * Determine weekday for date passed as parameter. Date must be 01/01/1900
     * or later.
     *
     * @param day integer data type.
     * @param month integer data type.
     * @param year integer data type.
     * @return String indicating weekday.
     */
    public String getWeekDay(int day, int month, int year) {
        String weekDay; // Weekday of given date.
        int yearsSince; // Years since 1900
        boolean isLeapYear = false; // Is year a leap year

        yearsSince = year - 1900; // Calculate the number of years since 1900.
        numberOfDays = yearsSince * 365; // Calc. days since begining of 1900

        int count = 0; // Number of leap years
        for (int i = 1900; i <= year; i++) { // Count leap years since 1900
            if ((i % 4 == 0) && i % 100 != 0) { // If year is divisible by 4
                // and not divisible by 100 then it is a leap year.
                count++;
            } else if (i % 400 == 0) { // Else if year is divisible by 400 then
                count++; // it is a leap year.
            }
        } // end for loop
        numberOfDays += count; // Add leap years to total.

        switch (month) { // If given date is in:
            case DECEMBER: // December, add all days of the year before December
                numberOfDays += 30;
            case NOVEMBER: // November, add all days of the year before November
                numberOfDays += 31;
            case OCTOBER: // October, add all days of the year before October.
                numberOfDays += 30;
            case SEPTEMBER: // Sept. add all days of the year before Sept.
                numberOfDays += 31;
            case AUGUST: // August, add all days of the year before August.
                numberOfDays += 31;
            case JULY: // July, add all days of the year before July.
                numberOfDays += 30;
            case JUNE: // June, add all days of the year before June.
                numberOfDays += 31;
            case MAY: // May, add all days of the year before May.
                numberOfDays += 30;
            case APRIL: // April, add all days of the year before April.
                numberOfDays += 31;
            case MARCH: // March, add all days of the year before March.
                numberOfDays += 28;
            case FEBRUARY: // February, add all days of the year before Fenruary
                numberOfDays += 31;
            case JANUARY: // January, add nothing.
                break;
        } // end switch

        numberOfDays += day; // Add days of current month.

        if ((year % 4 == 0) && year % 100 != 0) { // If year is divisible by 4
            isLeapYear = true; // but not by 100, then it is a leap year. 
        } else if (year % 400 == 0) { // Otherwise, if it is divisible by 400
            isLeapYear = true; // then it is a leap year.
        }

        if (isLeapYear == true) { // 
            if (month == 1 || month == 2) {
                numberOfDays--; // Leap years have been included, so if it is a
            } // leap year and month is 1 or 2, then count must be reduced by 1
        }

        // Dividing the count by 7, will produce an integer remainder (possibly
        // zero). This integer corresponds to weekday, as defined above.
        switch (numberOfDays % 7) {
            case SUNDAY: // If integer remainder is 0:
                weekDay = "Sunday"; // Weekday is Sunday.
                break;
            case MONDAY: // If integer remained is 1:
                weekDay = "Monday"; // Weekday is Monday.
                break;
            case TUESDAY: // If integer remained is 2:
                weekDay = "Tuesday"; // Weekday is Tuesday.
                break;
            case WEDNESDAY: // If integer remained is 3:
                weekDay = "Wednesday"; // Weekday is Wednesday.
                break;
            case THURSDAY: // If integer remained is 4:
                weekDay = "Thursday"; // Weekday is Thursday.
                break;
            case FRIDAY: // If integer remained is 5:
                weekDay = "Friday"; // Weekday is Friday.
                break;
            case SATURDAY: // If integer remained is 16:
                weekDay = "Saturday"; // Weekday is Saturday.
                break;
            default:
                weekDay = "Invalid day of week.";
                break;
        }
        return weekDay;
    } // end getWeekDay

} // end class WeekDay

