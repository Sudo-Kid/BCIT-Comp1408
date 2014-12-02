import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory
{
    // instance variables - replace the example below with your own
    private static ArrayList<Vehicle> vehicles;

    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
        vehicles = new ArrayList<Vehicle>();
    }

    /**
     * @return Gets the Array of Vehicles
     */
    public static ArrayList<Vehicle> getVehicles()
    {
        return vehicles;
    }

    /**
     * @param _vehicles used to set the value of the vehicles array
     */
    public static void setVehicles(ArrayList<Vehicle> _vehicles)
    {
        vehicles = _vehicles;
    }

    /**
     * @param vehicles used to add a vehicle to the inventory
     */
    public void addVehicle(Vehicle vehicles)
    {
        if(vehicles != null) {
            this.vehicles.add(vehicles);
        } else {
            System.out.println("Your vehicle is null.");
        }
    }

    /**
     * @param model used to display all vehicles with given model
     */
    public void searchByModel(String model)
    {
        System.out.println("\nListing the results for searching by Vehicle model:\n");
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for(Vehicle index : vehicles) {
            if(index.getModel().equals(model)) {
                results.add(index);
            }
        }
        displaySearchResults(results);
    }

    /**
     * @param year used to display all vehicles of given year
     */
    public void searchByYear(int year)
    {
        System.out.println("\nListing the results for searching by Vehicle year:\n");
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for(Vehicle index : vehicles) {
            if(index.getYear() == year) {
                results.add(index);
            }
        }
        displaySearchResults(results);
    }

    /**
     * Displays all vehicles in a given price range
     * @param minPrice used to set the starting price to search by
     * @param maxPrice used to set the max price to search by
     */
    public void searchByPrice(double minPrice, double maxPrice)
    {
        System.out.println("\nListing the results for searching by Vehicle price range:\n");
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        for(Vehicle index : vehicles) {
            if(minPrice <= index.getSellingPrice() && maxPrice >= index.getSellingPrice()) {
                results.add(index);
            }
        }
        displaySearchResults(results);
    }

    /**
     * @param results Prints the contents of results array to screen
     */
    public void displaySearchResults(ArrayList<Vehicle> results)
    {
        for(Vehicle index : results) {
            index.printDetails();
            System.out.println();
        }
    }

    /**
     * @param stockCode used to remove a vehicle by stock code
     */
    public static void removeVehicle(String stockCode)
    {
        Iterator<Vehicle> index = vehicles.iterator();
        while(index.hasNext()) {
            Vehicle vehicle = index.next();
            if(vehicle.getStockCode().equals(stockCode)) {
                index.remove();
            }
        }
    }

    /**
     * @return gets the total number of vehicles in inventory
     */
    public String inventoryCount()
    {
        int inventoryCount = vehicles.size() + 1;
        return "There are currently " + inventoryCount + " vehicles in on the lot.";
    }

    /**
     * @return gets the total dollar amount of inventory
     */
    public String inventoryValue()
    {
        double inventoryValue = 0;
        for(Vehicle index : vehicles) {
            inventoryValue += index.getdealerCost();
        }
        return "You have $" + inventoryValue + " in stock.";
    }

    /**
     * Displays all inventory to screen
     */
    public void displayInventory()
    {
        System.out.println(inventoryCount());
        System.out.println("\nJalopies Are Us Vehicle Summary:\n");
        for(Vehicle index : vehicles) {
            index.printDetails();
            System.out.println();
        }
    }
}
