package day15_0_create_update_delete;

public class SalesExecutive extends Employee {

    private double allowance;

    public SalesExecutive(int empId, String empname, int basicSal, double hra, double da, double d) { 
        super(empId, empname, basicSal, hra, da);
        this.allowance = allowance;
    }

   
    
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("SalesExecutive Travel Allowance: " + allowance);
    }
}
