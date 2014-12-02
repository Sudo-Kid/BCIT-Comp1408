import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Write a description of class TreeFarm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreeFarm
{
    // instance variables - replace the example below with your own
    private ArrayList<Tree> treeFarm;

    /**
     * Constructor for objects of class TreeFarm
     */
    public TreeFarm()
    {
        treeFarm = new ArrayList<Tree>();
    }

    /**
     * @param tree adds tree to TreeFarm
     */
    public void addTree(Tree tree)
    {
        treeFarm.add(tree);
    }

    /**
     * Displays all the trees in the farm
     */
    public void showAllTrees()
    {
        for(Tree index : treeFarm) {
            System.out.println("Species: " + index.getSpecies() + " Age: " + index.getAge());
        }
    }

    /**
     * @param age removes all trees = to or > age
     */
    public void logOldTrees(Integer age)
    {
        Iterator<Tree> it = treeFarm.iterator();
        while(it.hasNext()) {
            Tree tree = it.next();
            if(tree.getAge() >= age) {
                it.remove();
            }
        }
    }

    /**
     * @param tree1 sets the first tree to use in swap
     * @param tree2 sets the second tree to use in swap
     */
    public void swap(int tree1, int tree2)
    {
        Collections.swap(treeFarm,tree1,tree2);
    }
}
