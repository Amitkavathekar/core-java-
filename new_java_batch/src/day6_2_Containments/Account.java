package day6_2_Containments;

import day4.MyDate; // Importing the MyDate class from the day4 package

public class Account {

    private int accountnumber; 
    private String accountName; 
    private MyDate accountCreationDate; 

    // Default constructor initializes the Account object with default values
    public Account() {
        accountnumber = 10; 
        accountName = "aniket";
        accountCreationDate = new MyDate(); 
    }

    // Overridden toString method to return a string 
    @Override
    public String toString() {
        // Return a string with all the account details
        return "Account [accountnumber=" + accountnumber + ", accountName=" + accountName + ", accountCreationDate="
                + accountCreationDate + "]";
    }
}
