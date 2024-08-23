package day8;

public class MainApp {
    public static void main(String[] args) {
    	
      Employee emp = new Manager(101, "Amit", 402, 5004.0, 5555.0, 12.0);
        emp.printinfo(); 
      
     Manager mgr=(Manager)emp;
     mgr.CalculateSalary();
  
   
   
        
    }
}
