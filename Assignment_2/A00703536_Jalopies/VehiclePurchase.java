/**
 * Write a description of class Customer here.
 * 
 * @author Emett Speer A00703536
 * @version 
 */
public class VehiclePurchase
{
    // instance variables - replace the example below with your own
    private Customer customer;
    private PurchaseDate purchaseDate;
    private Vehicle vehiclePurchased;
    private boolean servicePackage;
    public static final double SERVICE_FEE = 500.00;
    

    /**
     * @param renter used to initialize the customer feild
     * @param purchaseDate used to initialize the purchase date feild
     * @param vehiclePurchased used to initialize the vehicle purchased feild
     * @param servicePackage used to initialize the service package feild
     */
    public VehiclePurchase(Customer renter, PurchaseDate purchaseDate, 
        Vehicle vehiclePurchased, boolean servicePackage)
    {

        this.customer = renter;
        this.purchaseDate = purchaseDate;
        this.vehiclePurchased = vehiclePurchased;
        this.servicePackage = servicePackage;

    }

    /**
     * @return Gets the value of the customer field
     */
    public Customer getCustomer()
    {
        return customer;
    }

    /**
     * @return Gets the value of the purchase data feild
     */
    public PurchaseDate getPurchaseDate()
    {
        return purchaseDate;
    }

    /**
     * @return Gets the value of the vehicle purchased field
     */
    public Vehicle getVehiclePurchased()
    {
        return vehiclePurchased;
    }

    /**
     * @return Gets the status from the service package field
     */
    public boolean isServicePackage()
    {
        return servicePackage;
    }

    /**
     * @param _servicePackage used to update the status of if you got the service package or not
     */
    public void setServicePackage(boolean _servicePackage)
    {
        servicePackage = _servicePackage;
    }

    /**
     * @param purchasePrice used to calculate the price with service fee's
     */
    public void calculatePurchasePrice(double purchasePrice)
    {
        if(servicePackage == true) {
            purchasePrice += SERVICE_FEE; 
        } 

        vehiclePurchased.setSellingPrice(purchasePrice);
    }


    /**
     * Displays the details of the sale
     */
    public void displayDetails()
    {
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("Purchase Date: " + purchaseDate.getFullDate());
        System.out.print("Vehicle Description: ");
        vehiclePurchased.printDetails();
        if(servicePackage == true) {
            System.out.println("SERVICE PACKAGE INCLUDED");
        } else {
            System.out.println("SERVICE PACKAGE NOT INCLUDED");
        }
    }
}
