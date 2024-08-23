package day6_5_superkeyword;

public class Manager extends Employee {

	private double inc;
	
	public Manager(int basicsal,double hra,double da,double inc) {
		super(basicsal,hra,da);
		this.inc=inc;
	}
	
	public double calculateInc() {
	return inc;
	}
}
 