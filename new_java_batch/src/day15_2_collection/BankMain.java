package day15_2_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class BankMain {
    public static void main(String[] args) {
        // Creating an ArrayList of Account objects
        ArrayList<Account> accountList = new ArrayList<>();

        // Adding 5 Account objects to the ArrayList
        accountList.add(new Account(101, "Alice", 5000.0));
        accountList.add(new Account(102, "Bob", 10000.0));
        accountList.add(new Account(103, "Charlie", 7500.0));
        accountList.add(new Account(104, "David", 15000.0));
        accountList.add(new Account(105, "Eve", 20000.0));

        // Displaying the Account objects using an Iterator
        Iterator<Account> iterator = accountList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

