
/**
 * Write a description of class Model here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Model
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    /**
     * Constructor for objects of class Model
     */
    public Model()
    {
        
    }

    /**
     * Overleaded Constructor
     * 
     * @param _firstName used to initiate first name field as a string
     * @param _lastName used to initiate last name field as a string
     * @param _height used to initiate the height field as a int
     * @param _weight used to initiate the weight field as a double
     * @param _canTravel used to initiate if the model can travel as a boolean
     * @param _smokes used to initiate if the model smokes as a boolean
     */
    public Model(String _firstName, String _lastName, int _height, double _weight,
                    boolean _canTravel, boolean _smokes)
    {
        setFirstName(_firstName);
        setLastName(_lastName);
        setHeight(_height);
        setWeight(_weight);
        setCanTravel(_canTravel);
        setSmokes(_smokes);
    }
    
    /**
     * @param _height used to set the models height as a int
     */
    public void setHeight(int _height)
    {
        if (_height >= 0) {
            height = _height;
        } else {
            System.out.println("Your value must not be less then 0");
        }
    }

    /**
     * @param _weight used to set the models weight as a double
     */
    public void setWeight(double _weight)
    {
        if (_weight >= 0) {
            weight = _weight;
        } else {
            System.out.println("Your value must not be less then 0");
        }      
    }

    /**
     * @param _firstName used to set the models first name as a string
     */
    public void setFirstName(String _firstName)
    {
        if (!_firstName.isEmpty() && _firstName != null) {
            firstName = _firstName;
        } else {
            System.out.println("You must input a first name");
        }
    }

    /** 
     * @param _lastName used to set the models last name as a string
     */
    public void setLastName(String _lastName)
    {
        if(!_lastName.isEmpty() && _lastName != null) {
            lastName = _lastName;
        } else {
            System.out.println("You must input a last name");
        }
    }

    /**
     * @param _canTravel used to set the models ability to travel as a boolean
     */
    public void setCanTravel(boolean _canTravel)
    {
        canTravel = _canTravel;
    }

    /**
     * @param _smokes used to set if the model smokes as a boolean
     */
    public void setSmokes(boolean _smokes)
    {
        smokes = _smokes;
    }

    /**
     * @return Gets the first name of the model as a string
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return Gets the last name of the model as a string
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @return Gets the height of the model as a int
     */
    public int getHeight()
    {
        return height;
    }

    /** 
     * @return Gets the weight of the model as a double
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * @return Gets if the model can travel or not as a boolean
     */
    public boolean isCanTravel()
    {
        return canTravel;
    }

    /**
     * @return Gets if the model smokes or not as a boolean
     */
    public boolean isSomkes()
    {
        return smokes;
    }
    
    public void displayModelDetails()
    {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Height: " + height + " inches");
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Travels: " + canTravel);
        System.out.println("Somkes: " + smokes);
    }
}