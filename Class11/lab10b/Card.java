
/**
 * Write a description of class Card here.
 * 
 * @author Emett Speer A00703536
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private String description;
    private String suit;
    private Integer value;

    /**
     * Constructor for objects of class Card
     */
    public Card()
    {

    }

    /**
     * @param description used to initialize the description name feild
     * @param suit used to initialize the suit name feild
     * @param value used to initialize the value name feild
     */
    public Card(String description, String suit, Integer value)
    {
        this.description = description;
        this.suit = suit;
        this.value = value;
    }

    /**
     * @return used to get the description field
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return used to get the suit field
     */
    public Integer getValue()
    {
        return value;
    }

    /**
     * @return used to get the value field
     */
    public String getSuit()
    {
        return suit;
    }

    /**
     * @param description used to set the description field
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @param suit used to set the suit field
     */
    public void setValue(Integer value)
    {
        this.value = value;
    }

    /**
     * @param value used to set the value field
     */
    public void setSuit(String suit)
    {
        this.suit = suit;
    }
}
