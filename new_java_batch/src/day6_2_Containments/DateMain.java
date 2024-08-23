package day6_2_Containments;

import day4.MyDate; // Importing the MyDate class from the day4 package

public class DateMain {

    public static void main(String[] args) { 
        Account acc = new Account();
        // Printing the default constructor of the Account instance
        System.out.println(acc);
        System.out.println("----------------------------------------");

        // Creating a Customer instance with a parameterized constructor
   Customer cus = new Customer(123, "aniket", new MyDate(15,"aug", 2008.));
        System.out.println(cus);
        System.out.println("----------------------------------------");

       
        // Creating a Student instance with a parameterized constructor
        Student stud = new Student();
        System.out.println(stud);
        System.out.println("----------------------------------------");
    }
}
