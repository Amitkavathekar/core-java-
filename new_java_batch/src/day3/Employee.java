package day3;

public class Employee {
	//varible declare 
	private int empId;
	private String empName;
	private double empSal;
	 
	//default construsctor
	 public Employee() {
	
	}
	 // parameterised constructor
	public Employee(int empId, String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	//getter method
	public int getEmpId() {
		return empId;
	}
	
	 //setter method 
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	 //main method
	public static void main(String[] args) {
		
	}
	 
	 
	 
}
