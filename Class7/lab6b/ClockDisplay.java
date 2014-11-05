
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay amPM;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        amPM = new NumberDisplay(2);

        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, String _amPM)
    {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        amPM = new NumberDisplay(2);
        setTime(hour, minute, _amPM);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        if(hours.getValue() == 12) {
           amPM.increment();
        }

        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute, String _amPM)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        convertToNumber(_amPM);
        
        updateDisplay();
    }

    public void convertToNumber(String _amPM)
    {
        if(_amPM.equals("am")) {
            amPM.setValue(0);
        } else if (_amPM.equals("pm")) {
            amPM.setValue(1);
        } else {
            System.out.println("You must set am or pm.");
        }
    }

    /**
     * @return Converts the in value of AMPM to a string
     */
    public String convertToAMPM()
    {
        if(amPM.getValue() == 0) {
            return "am";
        } if (amPM.getValue() == 1) {
            return "pm";
        } else {
            return "Your number is to large and you should feel bad!!";
        }
    }

    /**
     * Return the current time of this display in the format HH:MM:AM/PM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue() + " " + convertToAMPM();
    }
}
