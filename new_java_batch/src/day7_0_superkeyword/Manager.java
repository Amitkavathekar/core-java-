package day7_0_superkeyword;

public class Manager extends Employee {

	private double inc=3400;

	
	@Override
	public double CalculateSalary() {
		return super.CalculateSalary()+inc;
	}
}
 