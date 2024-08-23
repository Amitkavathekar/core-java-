package day7_2;

public class MainApp {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "Amit", 402, 5004.0, 5555.0, 12.0);
        double sal = mgr.CalculateSalary();
        mgr.printinfo(); 
      
        
    System.out.println("---------------------------------------");
   SalesExecutive sale = new SalesExecutive(102,"aniket",1,500.2,1.3, 504);
   double salary = sale.CalculateSalary();
   sale.printinfo();
 
   System.out.println("---------------------------------------");
   SalesExecutive nightallowance = new SalesExecutive(105,"aditya",1500,500.2,1.3, 504);
   double night = sale.CalculateSalary();
   sale.printinfo();
   
   
        
    }
}
