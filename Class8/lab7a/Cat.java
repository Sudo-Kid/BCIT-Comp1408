
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
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public sampleMethod(String _name, int _yearOfBirth, double _weightInKilos)
    {

    }

    public void setName(String _name)
    {
        if(!_name.isEmpty() && _name != null) {
            name = _name;
        } else {
            System.out.println("Please provide a name.")
        }
    }

    public void setYearOfBirth(int _yearOfBirth)
    {
        if(_yearOfBirth >= 0){
            yearOfBirth = _yearOfBirth;
        } else {
            System.out.println("Your year of birth must not be negative.")
        }
    }

    public void setWeightInKilos(double _weightInKilos)
    {
        if(_weightInKilos >= 0){
            weightInKilos = _weightInKilos;
        } else {
            System.out.println("Your weight must not be negative.")
        }
    }

    public String getName()
    {
        return name;
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }
    
    public double getWeightInKilos()
    {
        return weightInKilos;
    }
}
