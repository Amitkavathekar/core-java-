package day6_4_superkeyword;

public class MainApp {
	public static void main(String[] args) {
	
	Manager mgr =new Manager();
	double sal=mgr.CalculateSalary();
	double inc=mgr.calculateInc();
	
	System.out.println("total salary :"+(sal+inc));
	}

}
