package day6_containment;
import day4.MyDate;
public class MainEmp {

	public static void main(String[] args) {
		Employee emp =new Employee();
		System.out.println(emp);
		
		 System.out.println("========================================");
		 
		 MyDate d = new MyDate(2,"jan",2000.);
		 
		 Employee emp1 =new Employee(103,"sanket",6700,d);
		 System.out.println(emp1);

	}

}
