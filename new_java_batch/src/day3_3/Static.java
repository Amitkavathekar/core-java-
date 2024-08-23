package day3_3;

public class Static {
	
	static int count;
	private  int empId;
	private String empName;
	private double empSal;
	
	public Static(int empId, String empName, double empSal) {
		count++;
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	
}
