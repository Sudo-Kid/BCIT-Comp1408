/**
 * Write a description of class Customer here.
 * 
 * @author Emett Speer A00703536
 * @version 
 */
public class PurchaseDate
{
    // instance variables - replace the example below with your own
    private int year;
    private int month;
    private int day;

    // Setting the current year
    private static final int CURRENT_YEAR = 2014;

    // Setting the months of the year
    private static final int JANUARY    = 1;
    private static final int DECEMBER   = 12;

    // Setting the first and last days of the month
    private static final int FIRST_DAY  = 1;
    private static final int LAST_DAY   = 31;

    /**
     * Constructor for objects of class PurchaseDate
     */
    public PurchaseDate()
    {
        
    }

    /**
     * @param theYear used to initialize the year feild
     * @param theMonth used to initialize the month feild
     * @param theDay used to initialize the day feild
     */
    public PurchaseDate(int theYear, int theMonth, int theDay)
    {
        if(theYear >= CURRENT_YEAR) {
            if(theMonth >= JANUARY && theMonth <= DECEMBER) {
                if(theDay >= FIRST_DAY && theDay <= LAST_DAY) {
                    year = theYear;
                    month = theMonth;
                    day = theDay;
                }
            }
        } else {
            year = CURRENT_YEAR;
            month = JANUARY;
            day = FIRST_DAY;
        }
    }

    /**
     * @param _year sed to modify the year field as a int
     */
    public void setYear(int _year)
    {
        year = _year;
    }

    /**
     * @param _month sed to modify the month field as a int
     */
    public void setMonth(int _month)
    {
        month = _month;
    }

    /**
     * @param _day sed to modify the day field as a int
     */
    public void setDay(int _day)
    {
        day = _day;
    }

    /**
     * @return Gets the status of the year field as an int
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @return Gets the status of the month field as an int
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * @return Gets the status of the day field as an int
     */
    public int getDay()
    {
        return day;
    }

    /**
     * @return Gets the full date in YYYY-MM-DD format as a String
     */
    public String getFullDate()
    {
        String formattedDate;

        if(month < 10) {
            formattedDate = year + "-0" + month;
        } else {
            formattedDate = year + "-" + month;
        }

        if(day < 10) {
            formattedDate = formattedDate + "-0" + day;
        } else {
            formattedDate = formattedDate + "-" + day;
        }
        
        return formattedDate;
    }
}