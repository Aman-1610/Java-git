import java.util.*;

class CustomerDetails
{
    public String customerId;
    public String customerName;
    public String address;
    public long contactNumber;
    public void displayCustomerDetails()
    {
        System.out.println("Displaying customer details\n*************");
        System.out.println("customerId: "+customerId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Address: "+address);
        System.out.println("Contact Number: "+contactNumber);
    }
}
class FoodDetail
{
    public String foodName;
    public String Cuisine;
    public String foodType;
    public int quatityAvailable;
    public double unitPrice;
}
class FoodDetails
{
    
}