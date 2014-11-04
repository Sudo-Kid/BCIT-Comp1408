
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
     * @param  
     */
    public DayDisplay(int dayToSet)
    {
        day = new NumberDisplay(DAYS_OF_WEEK);
        day.setValue(dayToSet);
    }

    public String getCurrentDay()
    {
        if (day.getValue() == 0) {
            System.out.println("Sunday");
            return "Sunday";
        } else if (day.getValue() == 1) {
            System.out.println("Monday");
            return "Monday";
        } else if (day.getValue() == 2) {
            System.out.println("Thuesday");
            return "Thuesday";
        } else if (day.getValue() == 3) {
            System.out.println("Wednesday");
            return "Wednesday";
        } else if (day.getValue() == 4) {
            System.out.println("Thursday");
            return "Thursday";
        } else if (day.getValue() == 5) {
            System.out.println("Firday");
            return "Firday";
        } else if (day.getValue() == 6) {
            System.out.println("Saturday");
            return "Saturday";
        } else {
            System.out.println("YOUR DAY IS INVALID!! and you should feel bad!!");
            return "YOUR DAY IS INVALID!! and you should feel bad!!";
        }
    }

    public void incrementDay()
    {
        day.increment();
    }
}
