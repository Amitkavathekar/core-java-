package day8_2;

import java.util.Scanner; // Importing Scanner class for input
import day7_2.Employee; // Importing Employee class from day7_2 package
import day7_2.Devloper; // Importing Developer class from day7_2 package
import day7_2.Manager; // Importing Manager class from day7_2 package
import day7_2.SalesExecutive; // Importing SalesExecutive class from day7_2 package

public class Inheritanace2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for taking user input

        // Prompting the user to enter employee information
        System.out.println("Enter employee information!!!");
        System.out.println("=======================================");

        // Collecting employee ID
        System.out.print("Enter employee Id: ");
        int id = sc.nextInt();

        // Collecting employee name
        System.out.print("Enter employee Name: ");
        String name = sc.next();

        // Collecting employee basic salary
        System.out.print("Enter employee Basic Salary: ");
        int bsal = sc.nextInt();

        // Collecting employee home rent allowance
        System.out.print("Enter employee Home Rent Allowance: ");
        double hra = sc.nextDouble();

        // Collecting employee dearness allowance
        System.out.print("Enter employee DA: ");
        double da = sc.nextDouble();
        System.out.println("--------------------------------------------");

        // Prompting the user to choose the type of employee
        System.out.println("Choose one of the following options:");
        System.out.println("1. Manager");
        System.out.println("2. SalesExecutive");
        System.out.println("3. Developer");
        int op = sc.nextInt(); // User's choice
        System.out.println("-------------------------------------------");

        Employee emp = null; // Declaring an Employee reference to hold the object

        // Handling different types of employees based on user input
        if (op == 1) { // If the user selects Manager
            System.out.print("Enter Incentive Amount for Manager: ");
            double inc = sc.nextDouble();
            System.out.println(" ----------------------------------");
            emp = new Manager(id, name, bsal, hra, da, inc); // Creating Manager object
            emp.printinfo(); // Printing Manager information

        } else if (op == 2) { // If the user selects SalesExecutive
            System.out.print("Enter Travel Allowance for SalesExecutive: ");
            double ta = sc.nextDouble();
            System.out.println(" ----------------------------------");
            emp = new SalesExecutive(id, name, bsal, hra, da, ta); // Creating SalesExecutive object
            emp.printinfo(); // Printing SalesExecutive information

        } else if (op == 3) { // If the user selects Developer
            System.out.print("Enter Night Allowance for Developer: ");
            double na = sc.nextDouble();
            System.out.println(" ----------------------------------");
            emp = new Devloper(id, name, bsal, hra, da, na); // Creating Developer object
            emp.printinfo(); // Printing Developer information

        } else { // If the user selects an invalid option
            System.out.println("Invalid Option!!!!!");
        }
    }
}
