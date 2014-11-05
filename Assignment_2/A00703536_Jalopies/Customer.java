/**
 * Write a description of class Customer here.
 * 
 * @author Emett Speer A00703536
 * @version 
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String driversLicense;
    private String address;
    private String phoneNumber;

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        
    }

    /**
     * @param _firstName used to initialize the firstName feild
     * @param _lastName used to initialize the lastName feild
     * @param _driversLicense used to initialize the driversLicense feild
     * @param _address used to initialize the address feild
     * @param _phoneNumber used to initialize the phoneNumber feild
     */
    public Customer(String _firstName, String _lastName, String _driversLicense, String _address, String _phoneNumber)
    {
        setFirstName(_firstName);
        setLastName(_lastName);
        setDriversLicense(_driversLicense);
        setAddress(_address);
        setPhoneNumber(_phoneNumber);
    }

    /**
     * @return Converts the string to title case
     */
    public String titleCase(String _stringToTitelCase)
    {
        String lowerCased = _stringToTitelCase.toLowerCase();
        String firstChar = lowerCased.substring(0, 1);
        return firstChar.toUpperCase() + 
            lowerCased.substring(1, _stringToTitelCase.length());
    }

    /**
     * @return Verifies users input for null and empty
     */
    public String verifyString(String _stringToVerify)
    {
        String trimed = _stringToVerify.trim();
        if(!trimed.isEmpty() && trimed != null) {
            return _stringToVerify;
        } else {
            return null;
        }
    }

    /**
     * @param _firstName used to modify the firend name field as a String
     */
    public void setFirstName(String _firstName)
    {
        if(verifyString(_firstName) != null) {
            firstName = titleCase(_firstName);
        } else {
            System.out.println("Please provide a valid first name.");
        }
    }

    /**
     * @param _lastName used to modify the last name field as a String
     */
    public void setLastName(String _lastName)
    {
        if(verifyString(_lastName) != null) {
            lastName = titleCase(_lastName);
        } else {
            System.out.println("Please provide a valid last name.");
        }
    }

    /**
     * @param _driversLicense used to modify the drivers license field as a String
     */
    public void setDriversLicense(String _driversLicense)
    {
        if(verifyString(_driversLicense) != null) {
            driversLicense = _driversLicense;
        }
    }

    /**
     * @param _address used to modify the address field as a String
     */
    public void setAddress(String _address)
    {
        if(verifyString(_address) != null) {
            address = _address;
        }
    }

    /**
     * @param _phoneNumber used to modify the phone number field as a String
     */
    public void setPhoneNumber(String _phoneNumber)
    {
        phoneNumber = _phoneNumber;
    }


    /**
     * @return Gets the value of the first name field and returns it as a String
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return Gets the value of the last name field and returns it as a String
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @return Gets the value of the drivers license field and returns it as a String
     */
    public String getDriversLicense()
    {
        return driversLicense;
    }

    /**
     * @return Gets the value of the address field and returns it as a String
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @return Gets the value of the phone number field and returns it as a String
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * @return Gets the full name of the user
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
}
