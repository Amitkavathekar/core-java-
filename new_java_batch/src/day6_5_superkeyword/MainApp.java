package day6_5_superkeyword;

public class MainApp {
	public static void main(String[] args) {
	
	Manager mgr =new Manager(45000,5607,4225,6700);
	double sal=mgr.CalculateSalary();
	double inc=mgr.calculateInc();
	
	System.out.println("total salary :"+(sal+inc));
	}

}
