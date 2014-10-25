
/**
 * Class for creating a used vehicle
 * 
 * @author Emett Speer A00703536
 * @version 0.01
 */
public class Vehicle
{
    // instance variables - replace the example below with your own
    private String stockCode;
    private String make;
    private String model;
    private int year;
    private double dealerCost;
    private double sellingPrice;
    private double profitMargin;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        
    }

    /**
     * Constructor for objects of class Vehicle with params
     * 
     * @param _stockCode used to initialize the stock code field as a String
     * @param _make used to initialize the make field as a String
     * @param _model used to initialize the model field as a String
     * @param _year used to initialize the year field as an int
     */
    public Vehicle(String _stockCode, String _make, String _model, int _year)
    {
        if(!_stockCode.isEmpty() && _stockCode != null) {
            stockCode = _stockCode;
        } else {
            System.out.println("You must provide a stock code!");
        }
        
        if(!_make.isEmpty() && _make != null) {
            make = _make;
        } else {
            System.out.println("You must privde a make!");
        }
        
        if(!_model.isEmpty() && _make != null) {
            model = _model;
        } else {
            System.out.println("You must privde a model!");
        }
        
        if(_year >= 1950 && _year <= 2014) {
            year = _year;
        } else {
            System.out.println("You must privde a year between 1950 and the current year!");
        }
    }
    
    /**
     * @return Get the contents of the the stock code field in string format
     */
    public String getStockCode()
    {
        return stockCode;
    }
    
    /**
     * @return Get the contents of the make field in a string format
     */
    public String getMake()
    {
        return make;
    }
    
    /**
     * @return Get the contents of the model field in a string format
     */
    public String getModel()
    {
        return model;
    }
    
    /**
     * @return Get contents of the year field in an int format
     */
    public int getYear()
    {
        return year;
    }
    
    /**
     * @return Get the contents of the dealer cost field in a double format
     */
    public double getDealerCost()
    {
        return dealerCost;
    }
    
    /**
     * @return Get the contents of the selling price field in a double format
     */
    public double getSellingPrice()
    {
        return sellingPrice;
    }
    
    /**
     * @return Get the contents of the profit margin field in a double format
     */
    public double getProfitMargin()
    {
        return profitMargin;
    }
    
    /**
     * @param _stockCode used to set the stock code field in a string format
     */
    public void setStockCode(String _stockCode)
    {
        if(!_stockCode.isEmpty() && _stockCode != null) {
            stockCode = _stockCode;
        } else {
            System.out.println("You must provide a stock code!");
        }
    }
    
    /**
     * @param _make used to set the make field in a string format
     */
    public void setMake(String _make) 
    {
        if(!_make.isEmpty() && _make != null) {
            make = _make;
        } else {
            System.out.println("You must provide a make!");
        }
    }
    
    /**
     * @param _model used to set the model field in a string format
     */
    public void setModel(String _model)
    {
        if(!_model.isEmpty() && _model != null) {
            model = _model;
        } else {
            System.out.println("You must provide a model!");
        }
    }
    
    /**
     * @param _year used to set the year field in an int format
     */
    public void setYear(int _year)
    {
        if(_year >= 1950 && _year <= 2014) {
            year = _year;
        } else {
            System.out.println("You must privde a year between 1950 and the current year!");
        }
    }
    
    /**
     * @param _dealerCost used to set the dealer cost field in a double format
     */
    public void setDealerCost(double _dealerCost)
    {
        if(_dealerCost >= 0.00) {
            dealerCost = _dealerCost;
        } else {
            System.out.println("Dealer cost must be 0 or greater");
        }
    }
    
    /**
     * @param _sellingPrice used to check if the selling price is 25% or higher then the dealer cost and if it is then set it in a double format
     */
    public void checkStandardSellingPrice(double _sellingPrice)
    {
        if((dealerCost * 100) / _sellingPrice >= 25) {
            sellingPrice = _sellingPrice;
        } else {
            System.out.println("Dealer Cost: " + dealerCost);
            System.out.println("Selling Price: " + _sellingPrice);
        }
    }
    
    /**
     * @param _sellingPrice used to set the selling price field in a double format
     */
    public void setSellingPrice(double _sellingPrice)
    {
        if(_sellingPrice >= 0) {
            sellingPrice = _sellingPrice;
        } else {
            System.out.println("Selling Price must be 0 or greater");
        }
    }
    
    /**
     * @return Calculates the profit margin as a % then assigns it to the profit margin field
     */
    public double calculateProfitMargin()
    {
        profitMargin = (sellingPrice - dealerCost) / sellingPrice;
        return profitMargin;
    }
    
    /**
     * @return Gets the profit from the sale of a vehicle in a double format
     */
    public double displayProfit()
    {
        return (sellingPrice - dealerCost);
    }
    
    /**
     * Displays the details for a vehicle
     */
    public void printDetails()
    {
        System.out.println("Jalopies Are Us Vehicle Summary:");
        System.out.println("Vehicle: " + year + " " + make + " " + model);
        System.out.println("Stock Code: " + stockCode);
        System.out.println("Dealer Cost: $" + dealerCost);
        System.out.println("Selling Price: $" + sellingPrice);
        System.out.println("Profit Margin: " + profitMargin + "%");
        System.out.println("Dollar Profit: $" + displayProfit());
    }
}
