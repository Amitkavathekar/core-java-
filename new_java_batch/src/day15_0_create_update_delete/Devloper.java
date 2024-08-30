package day15_0_create_update_delete;

public class Devloper extends Employee {

    private double nightallowance;

    public Devloper(int empId, String empname, int basicSal, double hra, double da, double nightallowance) {
        super(empId, empname, basicSal, hra, da);
        this.nightallowance = nightallowance;
    }

    
    
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("Developer Night Allowance: " + nightallowance);
    }
}
