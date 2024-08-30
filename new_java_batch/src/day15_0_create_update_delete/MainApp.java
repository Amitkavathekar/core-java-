package day15_0_create_update_delete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    private static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Add Employee 1
        addEmployee();
        
        // Add Employee 2
        addEmployee();
        
        // Add Employee 3
        addEmployee();
        
        // Update Employee
        updateEmployee();
        
        // Delete Employee
        deleteEmployee();
        
        // Display All Employees
        displayAllEmployees();
        
        // Select and Display Particular Employee
        displayEmployee();
    }

    private static void addEmployee() {
        System.out.println("Add Employee");
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String empname = scanner.next();
        System.out.print("Enter Basic Salary: ");
        int basicSal = scanner.nextInt();
        System.out.print("Enter HRA: ");
        double hra = scanner.nextDouble();
        System.out.print("Enter DA: ");
        double da = scanner.nextDouble();

        SalesExecutive emp = new SalesExecutive(empId, empname, basicSal, hra, da, 0.0);
        employeeList.add(emp);
        System.out.println("Employee added successfully!");
        System.out.println("=======================");
    }

    private static void updateEmployee() {
        System.out.println("Update Employee");
        System.out.print("Enter Employee ID to update: ");
        int empId = scanner.nextInt();
        Employee emp = findEmployeeById(empId);
        if (emp == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.println("Update Employee Details:");
        System.out.print("Enter new Employee Name: ");
        String empname = scanner.next();
        System.out.print("Enter new Basic Salary: ");
        int basicSal = scanner.nextInt();
        System.out.print("Enter new HRA: ");
        double hra = scanner.nextDouble();
        System.out.print("Enter new DA: ");
        double da = scanner.nextDouble();

        emp.setEmpname(empname);
        emp.setBasicSal(basicSal);
        emp.setHra(hra);
        emp.setDa(da);
        System.out.println("Employee updated successfully!");
        System.out.println("=======================");
    }

    private static void deleteEmployee() {
        System.out.println("Delete Employee");
        System.out.print("Enter Employee ID to delete: ");
        int empId = scanner.nextInt();
        Employee emp = findEmployeeById(empId);
        if (emp == null) {
            System.out.println("Employee not found!");
            return;
        }

        employeeList.remove(emp);
        System.out.println("Employee deleted successfully!");
        System.out.println("=======================");
    }

    private static void displayAllEmployees() {
        System.out.println("Display All Employees");
        if (employeeList.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employeeList) {
                emp.printinfo();
                System.out.println("---------------------------------------");
            }
        }
        System.out.println("=======================");
    }

    private static void displayEmployee() {
        System.out.println("Display Particular Employee");
        System.out.print("Enter Employee ID to display: ");
        int empId = scanner.nextInt();
        Employee emp = findEmployeeById(empId);
        if (emp == null) {
            System.out.println("Employee not found!");
        } else {
            emp.printinfo();
        }
        System.out.println("=======================");
    }

    private static Employee findEmployeeById(int empId) {
        for (Employee emp : employeeList) {
            if (emp.getEmpId() == empId) {
                return emp;
            }
        }
        return null;
    }
}
