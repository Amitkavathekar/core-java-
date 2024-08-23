package day3;

public class Mainemp {
	
	public static void main(String[] args) {
		
		//prametrise constructor
		Employee emp= new Employee(123,"amit",1520.25);
		
		//default contructor
		Employee emp1= new Employee();
		emp1.setEmpId(234);
		emp1.setEmpName("aniket");
		emp1.setEmpSal(20.35);
		
		//prametrised print
		System.out.println("emp id:"+emp.getEmpId());
		System.out.println("emp name:"+emp.getEmpName());
		System.out.println("emp id:"+emp.getEmpSal());
		
		System.out.println("----------------------------------");
		
		 // DEFAULT PRINT
		System.out.println("emp id:"+emp1.getEmpId());
		System.out.println("emp name:"+emp1.getEmpName());
		System.out.println("emp id:"+emp1.getEmpSal());
	}
	
}
