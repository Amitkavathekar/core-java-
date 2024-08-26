package day11_2interface_PRINTABLE;

public class Employee implements printable {

    private int empId;
    private String empname;  
    private int basicSal;
    private double hra;
    private double da;

    public Employee(int empId, String empname, int basicSal, double hra, double da) {  
        this.empId = empId;
        this.empname = empname;
        this.basicSal = basicSal;
        this.hra = hra;
        this.da = da;
    }

    public double calculateSalary() {
        return basicSal + hra + da;
    }
    
    public void printInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empname); 
        System.out.println("Employee Basic Salary: " + basicSal);
        System.out.println("Employee HRA: " + hra);
        System.out.println("Employee DA: " + da);
        System.out.println("Total Salary: " + calculateSalary());
    }

    @Override
    public void print() {
        printInfo();
    }
}
