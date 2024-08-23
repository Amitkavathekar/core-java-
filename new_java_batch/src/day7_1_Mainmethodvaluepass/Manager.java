package day7_1_Mainmethodvaluepass;

public class Manager extends Employee {

    private double inc;

    public Manager(int empId, String empname, int basicSal, double hra, double da, double inc) { 
        super(empId, empname, basicSal, hra, da);
        this.inc = inc;
    }

    @Override
    public double CalculateSalary() {
        return super.CalculateSalary() + inc;
    }
    
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("Manager Incentive: " + inc);
        System.out.println("Manager Total Salary: " + CalculateSalary());
    }
}
