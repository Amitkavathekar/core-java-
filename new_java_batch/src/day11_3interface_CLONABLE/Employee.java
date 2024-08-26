package day11_3interface_CLONABLE;

public class Employee implements Cloneable {

    private int empId;
    private String empname;  
    private int basicSal;
    private double hra;
    private double da;

    public Employee(int empId, String empname, int basicSal, double hra, double da) {  
        this.empId = empId;
        this.empname = empname;
        this.basicSal = basicSal;
        this.hra = hra;
        this.da = da;
    }

    public double calculateSalary() {
        return basicSal + hra + da;
    }
   

    @Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", basicSal=" + basicSal + ", hra=" + hra + ", da="
				+ da + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
