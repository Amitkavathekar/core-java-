package day6_4_superkeyword;

public class Employee {


	private int basicSal;
	private double hra;
	private double da;
	
	public Employee(int basicSal, double hra, double da) {
		this.basicSal = basicSal;
		this.hra = hra;
		this.da = da;
	}

	public double CalculateSalary() {
		return basicSal+hra+da;
	}
}
