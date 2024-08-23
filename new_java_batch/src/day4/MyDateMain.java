package day4;

public class MyDateMain {

	public static void main(String[] args) {
		MyDate d1 =new MyDate();
		MyDate d2 =new MyDate(1,"feb",2001);
		
		System.out.println(d1);
		System.out.println(d2);
		
		 swap(d1,d2);
		
	}
	static void swap (MyDate dd1,MyDate dd2) {
		MyDate tempDate=dd1;
		dd1=dd2;
		dd2=tempDate;
		 System.out.println("========================================");

		
		System.out.println(dd1);
		System.out.println(dd2);
	}

	 
}


