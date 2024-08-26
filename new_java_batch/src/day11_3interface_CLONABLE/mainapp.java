package day11_3interface_CLONABLE;

public class mainapp {

    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "amit", 50000, 10000, 5000);
        
        System.out.println(emp);
        System.out.println("=====================================================");
        try {
			Employee emp1 =(Employee)emp.clone();
			System.out.println(emp);
		} catch (CloneNotSupportedException emp1) {
			emp1.printStackTrace();
		}
       
    }
}
