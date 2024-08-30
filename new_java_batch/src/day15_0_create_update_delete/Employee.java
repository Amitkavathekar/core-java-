package day15_0_create_update_delete;

public class Employee {

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

    public int getEmpId() {
        return empId;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setBasicSal(int basicSal) {
        this.basicSal = basicSal;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public void setDa(double da) {
        this.da = da;
    }
    
    public void printinfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empname); 
        System.out.println("Employee Basic Salary: " + basicSal);
        System.out.println("Employee HRA: " + hra);
        System.out.println("Employee DA: " + da);
    }
}
