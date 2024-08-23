package day7_1_Mainmethodvaluepass;

public class MainApp {
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "Amit", 402, 5004.0, 5555.0, 12.0);
        double sal = mgr.CalculateSalary();
        mgr.printinfo(); 
        System.out.println("Total Salary of Manager: " + sal);
    }
}
