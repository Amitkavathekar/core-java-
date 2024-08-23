package day8;

public class Devloper extends Employee {

    private double nightallowance;

    public Devloper(int empId, String empname, int basicSal, double hra, double da, double nightallowance) {
		super(empId, empname, basicSal, hra, da);
		this.nightallowance = nightallowance;
	}

    
	@Override
    public double CalculateSalary() {
        return super.CalculateSalary() + nightallowance ;
    }
    
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.println("night work nightallowance: " + nightallowance);
        System.out.println("nightallowanceTotal Salary: " + CalculateSalary());
    }
}
