package day7_0_superkeyword;

public class MainApp {
	public static void main(String[] args) {
		
	Employee emp =new Employee();
	System.out.println("salary from employee :"+emp.CalculateSalary());
	
	Manager mgr =new Manager();
	double sal=mgr.CalculateSalary();
	
	System.out.println("total salary fo manager  :"+sal);
	}

}
