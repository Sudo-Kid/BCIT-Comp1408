
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
     * @param  y   a sample parameter for a method
     */
    public Model(String _firstName, String _lastName, int _height, double _weight,
                    boolean _canTravel, boolean _smokes)
    {
        setFirstName(_firstName);
        setLastName(_lastName);
        setHeight(_height);
        setWeight(_weight);
        canTravel = _canTravel;
        smokes = _smokes;
    }
    
    public void setHeight(int _height)
    {
        if (_height >= 0) {
            height = _height;
        } else {
            System.out.println("Your value must not be less then 0");
        }
    }

    public void setWeight(double _weight)
    {
        if (_weight >= 0) {
            weight = _weight;
        } else {
            System.out.println("Your value must not be less then 0");
        }      
    }

    public void setFirstName(String _firstName)
    {
        if (!_firstName.isEmpty() && _firstName != null) {
            firstName = _firstName;
        } else {
            System.out.println("You must input a first name");
        }
    }

    public void setLastName(String _lastName)
    {
        if(!_lastName.isEmpty() && _lastName != null) {
            lastName = _lastName;
        } else {
            System.out.println("You must input a last name");
        }
    }

    public void setCanTravel(boolean _canTravel)
    {
        canTravel = _canTravel;
    }

    public void setSmokes(boolean _smokes)
    {
        smokes = _smokes;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    public boolean isCanTravel()
    {
        return canTravel;
    }

    public boolean isSomkes()
    {
        return smokes;
    }