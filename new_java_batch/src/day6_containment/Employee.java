package day6_containment;

import day4.MyDate;
public class Employee {
	
	private int empId;
	private String empName;
	private double empSal;
	private MyDate  joiningDate;
	
	public Employee() {
		empId=101;
		empName="amit";
		empSal= 34000.54;
		joiningDate=new MyDate();	
	}

	public Employee(int empId, String empName, double empSal, MyDate joiningDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.joiningDate = joiningDate;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", joiningDate="
				+ joiningDate + "]";
	}
	
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public MyDate getJoiningDate() {
		return joiningDate;
	}
		
	
}
