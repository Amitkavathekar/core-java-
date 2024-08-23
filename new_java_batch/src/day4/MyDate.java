
package day4;

public class MyDate {
	
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
	

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
	
	

