
/**
 *              Question 1, Assignment 1, COMP 268
 * Class:       AddressBook.java
 * Purpose:     Create address book entry. Provide getter/ setter classes.
 *
 * @author      Kenneth Sharman
 * Student ID:  3262188
 * Date:        Jan 7, 2017
 */
public class AddressBook {

    private String businessPhone;   // Business Phone number.
    private String cellPhone;       // Cell Phone number.
    private String facebookId;      // Facebook Id number.
    private String firstName;       // First name of contact.
    private String homeAddress;     // Home address of contact.
    private String homePhone;       // Home Phone number.
    private String lastName;        // Last name of contact;
    private String middleName;      // Middle name of contact.
    private String personalWebSite; // Website belonging to contact.
    private String skypeId;         // Skype Id number.

    /**
     * Create a new instance of class AddressBook. Initialize all instance
     * variables to values of the arguments passed through the constructor
     * parameters.
     *
     * @param fn - first name.
     * @param mn - middle name.
     * @param ln - last name.
     * @param homeAddress
     * @param businessPhone
     * @param homePhone
     * @param cellPhone
     * @param skypeId
     * @param facebookId
     * @param personalWebsite
     */
    public AddressBook(String fn, String mn, String ln, String homeAddress,
            String businessPhone, String homePhone, String cellPhone,
            String skypeId, String facebookId, String personalWebsite) {
        this.firstName = fn;
        this.middleName = mn;
        this.lastName = ln;
        this.homeAddress = homeAddress;
        this.businessPhone = businessPhone;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.skypeId = skypeId;
        this.facebookId = facebookId;
        this.personalWebSite = personalWebsite;
    }

    /**
     * Create a new instance of class AddressBook. Initialize instance firstName
     * variable to value of argument passed through the constructor parameter.
     *
     * @param fn - first name.
     */
    public AddressBook(String fn) {
        this.firstName = fn;
    }

    /**
     * Create a new instance of class AddressBook. Initialize instance
     * firstName, middleName variables to values of arguments passed through the
     * constructor parameters.
     *
     * @param fn - first name.
     * @param mn - middle name.
     */
    public AddressBook(String fn, String mn) {
        this.firstName = fn;
        this.middleName = mn;
    }

    /**
     * Create a new instance of class AddressBook. Initialize instance
     * firstName, middleName, lastName variables to values of arguments passed
     * through the constructor parameters.
     *
     * @param fn - first name.
     * @param mn - middle name.
     * @param ln - last name
     */
    public AddressBook(String fn, String mn, String ln) {
        this.firstName = fn;
        this.middleName = mn;
        this.lastName = ln;
    }

    /**
     * Retrieve the value of businessPhone.
     *
     * @return A String data type.
     */
    public String getBusinessPhone() {
        return this.businessPhone;
    }

    /**
     * Set the value of businessPhone.
     *
     * @param businessPhone
     */
    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    /**
     * Retrieve the value of cellPhone.
     *
     * @return A String data type.
     */
    public String getCellPhone() {
        return this.cellPhone;
    }

    /**
     * Set the value of cellPhone.
     *
     * @param cellPhone
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * Retrieve the value of facebookId
     *
     * @return A String data type.
     */
    public String getFacebookId() {
        return this.facebookId;
    }

    /**
     * Set the value of facebookId.
     *
     * @param facebookId
     */
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    /**
     * Retrieve the value of firstName.
     *
     * @return A String data type.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Set the value of firstName.
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrieve the value of homeAddress.
     *
     * @return A String data type.
     */
    public String getHomeAddress() {
        return this.homeAddress;
    }

    /**
     * Set the value of homeAddress
     *
     * @param homeAddress
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * Retrieve the value of homePhone.
     *
     * @return A String data type.
     */
    public String getHomePhone() {
        return this.homePhone;
    }

    /**
     * Set the value of homePhone.
     *
     * @param homePhone
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * Retrieve the value of lastName.
     *
     * @return A String data type.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Set the value of lastName.
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieve the value of middleName.
     *
     * @return A String data type.
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Set the value of middleName.
     *
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Retrieve the value of personalWebSite.
     *
     * @return A String data type.
     */
    public String getPersonalWebSite() {
        return this.personalWebSite;
    }

    /**
     * Set the value of personalWebSite.
     *
     * @param personalWebSite
     */
    public void setPersonalWebSite(String personalWebSite) {
        this.personalWebSite = personalWebSite;
    }

    /**
     * Retrieve the value of skypeId.
     *
     * @return A String data type.
     */
    public String getSkypeId() {
        return this.skypeId;
    }

    /**
     * Set the value of skypeId.
     *
     * @param skypeId
     */
    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    /**
     * Compare two objects of type AddressBook. If their firstName, middleName,
     * and lastName all match, then "Yes! The names match." String will be
     * returned. Otherwise, "No. The names do not match." String will be return.
     *
     * @param name1
     * @param name2
     * @return
     */
    public static String compareNames(AddressBook name1, AddressBook name2) {
        boolean result;

        result = name1.getFirstName().equalsIgnoreCase(name2.getFirstName())
                && name1.getMiddleName().equalsIgnoreCase(name2.getMiddleName())
                && name1.getLastName().equalsIgnoreCase(name2.getLastName());

        if (result == true) {
            return "Yes! The names match.";
        } else {
            return "No. The names do not match.";
        }
    } // end compareNames

} // end class Address Book

