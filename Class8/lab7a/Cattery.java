import java.util.ArrayList;

/**
 * Write a description of class Cattery here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cattery
{
    // instance variables - replace the example below with your own
    private ArrayList<Cat> cat;
    private String businessName;

    /**
     * Constructor for objects of class Cattery
     */
    public Cattery()
    {
        cat = new ArrayList<Cat>();
    }

    /**
     * @param  _businessName used to initialize the business name feild
     */
    public Cattery(String _businessName)
    {
        cat = new ArrayList<Cat>();
        setBusinessName(_businessName);
    }

    /**
     * @param  _businessName used to set the business name feild
     */
    public void setBusinessName(String _businessName)
    {
        if(!_businessName.isEmpty() && _businessName != null) {
            businessName = _businessName;
        } else {
            System.out.println("Please provide a valid business name.");
        }
    }

    /**
     * @param  _cat used to add a cat to the cat array
     */
    public void addCat(Cat _cat)
    {
        cat.add(_cat);
    }

    /**
     * @param index used to display information for cat at index int cat array
     */
    public void getCat(int index)
    {
        if(index >= 0 && index < cat.size()) {
            System.out.println("Name: " + cat.get(index).getName());
            System.out.println("Year of Birth: " + cat.get(index).getYearOfBirth());
            System.out.println("Weight in Kilos: " + cat.get(index).getWeightInKilos());
        } else{
            System.out.println("Not a valid index");
        }
    }

    /**
     * @param index used to remove cat from cat array by index number
     */
    public void removeCat(int index)
    {
        if(index >= 0 && index < cat.size()) {
            cat.remove(index);
        }
    }

    /**
     * Displays all the cats from the cat array
     */
    public void displayCats()
    {
        System.out.println("The current guests in Puss in " +  businessName + ":");

        for(Cat index : cat) {
            System.out.println(index.getName());
        }
    }
}
