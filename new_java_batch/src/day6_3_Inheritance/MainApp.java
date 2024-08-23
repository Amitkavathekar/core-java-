package day6_3_Inheritance;

public class MainApp {

	public static void main(String[] args) {
	Employee emp=new Employee();
	
	double empsal=emp.CalculateSalary();
	System.out.println("super class salary:"+empsal);

	Manager mgr =new Manager();
	double sal=mgr.CalculateSalary();
	double inc=mgr.calculateInc();
	
	System.out.println("total salary :"+(sal+inc));
	}

}
