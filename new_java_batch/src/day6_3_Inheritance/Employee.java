package day6_3_Inheritance;

public class Employee {

	private int basicSal=23000;
	private double hra=4000;
	private double da=560;
	
	public double CalculateSalary() {
		return basicSal+hra+da;
	}
}
