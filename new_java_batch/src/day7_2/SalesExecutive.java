package day7_2;

public class SalesExecutive extends Employee {

    private double allowance;

    public SalesExecutive(int empId, String empname, int basicSal, double hra, double da, double inc) { 
        super(empId, empname, basicSal, hra, da);
        this.allowance = allowance;
    }

    @Override
    public double CalculateSalary() {
        return super.CalculateSalary() + allowance;
    }
    
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("SalesExecutive traval allowance: " + allowance);
        System.out.println("SalesExecutive total allowance: " +CalculateSalary());
    }
}
