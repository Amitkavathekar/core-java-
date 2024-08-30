package day15_3_Comparable;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String eName;
	private double eSal;
	
	public Employee(int empId, String eName, double eSal) {
		this.empId = empId;
		this.eName = eName;
		this.eSal = eSal;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String geteName() {
		return eName;
	}

	public double geteSal() {
		return eSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", eSal=" + eSal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return eName.compareTo(o.eName);//this used for the print String data 
//		if(empId>o.empId) {
//			return 1;
//			
//		}else if(empId<o.empId) {
//			return -1;
//		}else {
//			return 0;
//		}
	}
	

	
}

