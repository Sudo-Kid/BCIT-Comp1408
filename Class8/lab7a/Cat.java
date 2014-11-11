
/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat
{
    // instance variables - replace the example below with your own
    private String name;
    private int yearOfBirth;
    private double weightInKilos;

    /**
     * Constructor for objects of class Cat
     */
    public Cat()
    {
    }

    /**
     * @param _name used to initialize the business name feild
     * @param _yearOfBirth used to initialize the business name feild
     * @param _weightInKilos used to initialize the business name feild
     */
    public Cat(String _name, int _yearOfBirth, double _weightInKilos)
    {
        setName(_name);
        setYearOfBirth(_yearOfBirth);
        setWeightInKilos(_weightInKilos);
    }

    /**
     * @param _name used to set name field as a string
     */
    public void setName(String _name)
    {
        if(!_name.isEmpty() && _name != null) {
            name = _name;
        } else {
            System.out.println("Please provide a name.");
        }
    }

    /**
     * @param _yearOfBirth used to set the year of birth field as an int
     */
    public void setYearOfBirth(int _yearOfBirth)
    {
        if(_yearOfBirth >= 0){
            yearOfBirth = _yearOfBirth;
        } else {
            System.out.println("Your year of birth must not be negative.");
        }
    }

    /**
     * @param _weightInKilos used to set the weight in kilos field as a double
     */
    public void setWeightInKilos(double _weightInKilos)
    {
        if(_weightInKilos >= 0){
            weightInKilos = _weightInKilos;
        } else {
            System.out.println("Your weight must not be negative.");
        }
    }

    /**
     * @return Gets the value of the name field as a string
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return Gets the value of the yeaer of birth field as an int
     */
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }
    
    /**
     * @return Gets the value of the weight in kilos field as a double
     */
    public double getWeightInKilos()
    {
        return weightInKilos;
    }
}
