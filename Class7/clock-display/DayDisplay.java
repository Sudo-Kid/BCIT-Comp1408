
/**
 * Write a description of class DayDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayDisplay
{
    // instance variables - replace the example below with your own
    public static final int DAYS_OF_WEEK = 7;
    private NumberDisplay day;

    /**
     * Constructor for objects of class DayDisplay
     */
    public DayDisplay()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     */
    public DayDisplay(int dayToSet)
    {
        day = dayToSet;
    }

    public String getCurrentDay()
    {
        if (day == 0) {
            return "Sunday";
        } else if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Thuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Firday";
        } else if (day == 6) {
            return "Saturday";
        } else {
            return "YOUR DAY IS INVALID!! and you should feel bad!!";
        }
    }

    public void incrementDay()
    {
        day++;
    }
}
