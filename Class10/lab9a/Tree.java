
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private int age;
    private String species;

    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
    }

    /**
     * @param age sets the age field at an int
     * @param species sets the species as a Streing
     */
    public Tree(int age, String species)
    {
        this.age = age;
        this.species = species;
    }

    /**
     * @return gets the age of the tree
     */
    public int getAge()
    {
        return age;
    }

    /**
     * @return gets teh species of the tree
     */
    public String getSpecies()
    {
        return species;
    }

    /**
     * @param age sets the age field at an int
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * @param species sets the species as a Streing
     */
    public void setSpecies(String species)
    {
        this.species = species;
    }
}
