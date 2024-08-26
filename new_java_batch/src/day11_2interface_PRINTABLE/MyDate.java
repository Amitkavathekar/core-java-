package day11_2interface_PRINTABLE;
public class MyDate implements printable {
	
	private int day;
	private String month;
	private double year;
	
	public MyDate() {
		day=12;
		month="jan";
		year=2002;
	}

	public MyDate(int day, String month, double year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void printInfo() {
		// TO System.out.println("Employee ID: " + empId);
        System.out.println("day is: " + day); 
        System.out.println("month is: " + month);
        System.out.println("year is: " + year);
	}
	 @Override
	    public void print() {
	        printInfo();
	    }
}
	
	

