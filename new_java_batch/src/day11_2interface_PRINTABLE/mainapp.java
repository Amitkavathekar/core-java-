package day11_2interface_PRINTABLE;

public class mainapp {

    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "amit", 50000, 10000, 5000);
        
        // Use the Employee object to call the print method
        emp.print();  // This will call the print() method in Employee, which prints employee details

        // Calling static method from interface
        printable.demoprint();

        // Calling default method from interface
        emp.print11();
        
        System.out.println("====================================================");
        MyDate Date =new MyDate();
        Date.print();
        
        printable.demoprint();
        emp.print11();
        
        
        
    }
}
