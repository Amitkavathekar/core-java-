package day7_1_Mainmethodvaluepass;

public class Employee {

    private int empId;
    private String empname;  
    private int basicSal;
    private double hra;
    private double da;

    public Employee(int empId, String empname, int basicSal, double hra, double da) {  
        super();
        this.empId = empId;
        this.empname = empname;
        this.basicSal = basicSal;
        this.hra = hra;
        this.da = da;
    }

    public double CalculateSalary() {
        return basicSal + hra + da;
    }
    
    public void printinfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empname); 
        System.out.println("Employee Basic Salary: " + basicSal);
        System.out.println("Employee HRA: " + hra);
        System.out.println("Employee DA: " + da);
    }
}
