package day6_2_Containments;

import day4.MyDate; // Importing the MyDate class from the day4 package

public class Customer {
    private int customerid; 
    private String customername; 
    private MyDate deliverydate; 

    // Parameterized constructor to initialize a Customer object
    public Customer(int customerid, String customername, MyDate deliverydate) {
        this.customerid = customerid; 
        this.customername = customername; 
        this.deliverydate = deliverydate; 
    }

    // Overridden toString method to return a string
    @Override
    public String toString() {
        return "Customer [customerid=" + customerid + ", customername=" + customername + ", deliverydate="
                + deliverydate + "]";
    }
}
