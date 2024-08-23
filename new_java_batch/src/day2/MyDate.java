package day2;

class MyDate
{
	private int day,month,year;

	public void initDate()
	{
		day = 30;
		month = 6;
		year = 2011;
	}
	public void printDate()
	{
		System.out.println("date is a:" +day +"/" +month + "/" + year );
	}
	public static void main(String[] args) {
		MyDate d= new MyDate();
		d.initDate();
		d.printDate();
	}
}