
/**
 *              Question 1, Assignment 1, COMP 268
 * Class:       AddressBookDemo.java
 * Purpose:     Test class AddressBook. Two instances of AddressBook are created.
 *              Setter methods are tested by allowing user to modify first
 *              instance and initialize the second. compareNames method is
 *              tested at end of program.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 7, 2017
 */
import java.util.Scanner; // Make Scanner class available for input.

public class AddressBookDemo {

    static Scanner stdin = new Scanner(System.in); // Create new instance of Scanner class.

    public static void main(String[] args) {

        AddressBook contact1 = new AddressBook("Ken", "Barry", "Sharman",
                "955 Lake Placid Dr.", "587-582-WORK", "403-271-7363",
                "587-582-CELL", "skype001", "fb001", "www.google.com");
        // Create new instance of AddressBook and initialize all instance variables.

        System.out.println("\n***********************************************");
        System.out.println("\ncontact1 has been initialized with the following data:");
        processContact(contact1); // Call processContact with first instance of AddressBook.

        System.out.println("We will now test the contructors.");
        System.out.println("I will use the constructor with fn as the only formal parameter");
        System.out.print("Enter First Name: ");

        String firstName = stdin.nextLine(); // firstName entered by user.
        AddressBook contact2 = new AddressBook(firstName);
        // Create new instance of AddressBook and initialize instance firstName variable.

        System.out.println("\n***********************************************");
        System.out.println("\ncontact2 has been initialized with the following data:");
        processContact(contact2); //Call processContact with second instance of AddressBook.

        System.out.println("Time to test the compareNames method.");
        System.out.println("Do contact1 and contact2 have the same names?");
        System.out.println("(The first, middle and last must match)");
        System.out.println(AddressBook.compareNames(contact1, contact2));
        System.out.println();   // Check to see if instance names match.

    } // end of main()

    /**
     * processContact calls printContact to display initialized instance
     * variables. Prompts user for input to determine if Setter methods are
     * accessed, through rundModify method. printContact is called again, to
     * display (updated) instance variables.
     *
     * @param contact - instance of AddressBook
     */
    public static void processContact(AddressBook contact) {
        String modify; // User input - dictates if user wants to modify contact. 

        printContact(contact); // Initialized instance variables are displayed.
        System.out.println("Would you like to change any of this information?");
        System.out.println("\"y\" or \"yes\" will allow set method test.");
        System.out.println("Any other input will skip this process.");
        System.out.print(": ");

        modify = stdin.nextLine(); // User input.

        while (modify.equalsIgnoreCase("y") || modify.equalsIgnoreCase("yes")) {
            runModify(contact);
            System.out.println("\nContinue to make changes?");
            System.out.println("(To continue edit the input MUST be:\"y\" or \"yes\")");
            modify = stdin.nextLine();
        }   // User is given option to access setter methods. This loop runs
        // until user inputs anything besides "y" or "yes" (ignoring case).

        System.out.println("\n***********************************************");
        System.out.println("\nThe current contact information is as follows: ");
        printContact(contact); // (Updated) (Initialized) Instance variables are displayed.

    } // end processContact

    /**
     * Initialized instance variables, for given instance of AddressBook, are
     * displayed with formatted output. All constructors include firstName,
     * meaning fistName will always be displayed.
     *
     * @param contact
     */
    public static void printContact(AddressBook contact) {

        System.out.println();
        System.out.printf("%-20s", "First Name:");
        System.out.println(contact.getFirstName()); // firstName Getter called.
        if (contact.getMiddleName() != null) { // If initialized, middleName will be displayed. 
            System.out.printf("%-20s", "Middle Name:");
            System.out.println(contact.getMiddleName()); // middleName Getter called.
        }
        if (contact.getLastName() != null) {
            System.out.printf("%-20s", "Last Name:");
            System.out.println(contact.getLastName()); // lastName Getter called. 
        }
        if (contact.getBusinessPhone() != null) {
            System.out.printf("%-20s", "Business Phone:");
            System.out.println(contact.getBusinessPhone()); // businessphone Getter called.
        }
        if (contact.getCellPhone() != null) {
            System.out.printf("%-20s", "Cell Phone:");
            System.out.println(contact.getCellPhone()); // cellPhone Getter called.
        }
        if (contact.getHomePhone() != null) {
            System.out.printf("%-20s", "Home Phone:");
            System.out.println(contact.getHomePhone()); // homePhone Getter called.
        }
        if (contact.getHomeAddress() != null) {
            System.out.printf("%-20s", "Home Address:");
            System.out.println(contact.getHomeAddress()); // homeAddress Getter called.
        }
        if (contact.getPersonalWebSite() != null) {
            System.out.printf("%-20s", "Personal Website:");
            System.out.println(contact.getPersonalWebSite()); // personalWebSite Getter called.
        }
        if (contact.getFacebookId() != null) {
            System.out.printf("%-20s", "Facebook Id:");
            System.out.println(contact.getFacebookId()); // facebookId Getter called.
        }
        if (contact.getSkypeId() != null) {
            System.out.printf("%-20s", "Skype Id:");
            System.out.println(contact.getSkypeId()); // skypeId Getter called.
        }

        System.out.println();

    } // end printContact

    /**
     * User is prompted to input a number, corresponding to desired setter
     * method, as indicated by the printModifyMenu. A while loops runs until a
     * valid menu number is selected. At this point, the user is asked to input
     * new String, which is assigned to the corresponding instance variable.
     *
     * @param contact
     */
    public static void runModify(AddressBook contact) {

        System.out.println("\n**************************");
        System.out.println("\nThe following information may be changed.");
        printModifyMenu(); // Specific Setter options are displayed.

        loop: // labelled while loop runs until user inputs valid menu choice.
        while (true) {
            System.out.println("Please enter integer for desired change");
            String selection = stdin.nextLine(); // Menu selection from user.

            switch (selection) {
                case "0": {
                    System.out.println("New First Name:");
                    contact.setFirstName(stdin.nextLine()); // firstName set to input.
                    break loop; // break from switch and outer while loop.
                }
                case "1": {
                    System.out.println("New Middle Name:");
                    contact.setMiddleName(stdin.nextLine()); // middleName set to input.
                    break loop;
                }
                case "2": {
                    System.out.println("New Last Name:");
                    contact.setLastName(stdin.nextLine()); // lastName set to input.
                    break loop;
                }
                case "3": {
                    System.out.println("New Business Phone:");
                    contact.setBusinessPhone(stdin.nextLine()); // businessPhone set to input.
                    break loop;
                }
                case "4": {
                    System.out.println("New Cell Phone:");
                    contact.setCellPhone(stdin.nextLine()); // cellPhone set to input.
                    break loop;
                }
                case "5": {
                    System.out.println("New Home Phone:");
                    contact.setHomePhone(stdin.nextLine()); // homePhone set to input.
                    break loop;
                }
                case "6": {
                    System.out.println("New Home Address:");
                    contact.setHomeAddress(stdin.nextLine()); // homeAddress set to input.
                    break loop;
                }
                case "7": {
                    System.out.println("New Personal Website:");
                    contact.setPersonalWebSite(stdin.nextLine()); // personalWebSite set to input.
                    break loop;
                }
                case "8": {
                    System.out.println("New Facebook Id:");
                    contact.setFacebookId(stdin.nextLine()); // facebookId set to input.
                    break loop;
                }
                case "9": {
                    System.out.println("New Skype Id:");
                    contact.setSkypeId(stdin.nextLine()); // skypeId set to inpu.
                    break loop;
                }
                default:
                    System.out.println("Invalid Input.");
                // If input was not an integer 0-9 then message displayed and loop runs again.
            } // end switch

        } // end while

    } // end of runModify

    /**
     * Menu relates instance variables to integers. Used in runModify method.
     */
    public static void printModifyMenu() {

        System.out.println();
        System.out.println("0 - First Name");
        System.out.println("1 - Middle Name");
        System.out.println("2 - Last Name");
        System.out.println("3 - Business Phone");
        System.out.println("4 - Cell Phone");
        System.out.println("5 - Home Phone");
        System.out.println("6 - Home Address");
        System.out.println("7 - Personal Website");
        System.out.println("8 - Facebook Id");
        System.out.println("9 - Skype Id");
        System.out.println();

    } // end printModifyMenu()

} // end class AddressBookDemo
