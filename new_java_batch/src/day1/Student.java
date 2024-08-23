package day1;

public class Student {
	int studentId;
	String studentName;
	double studentAge;
	
	void initInfo() {
		studentId=10;
		studentName="aniket";
		studentAge=23;
	}
	void printInfo() {
		System.out.println("Student Id :"+studentId);
		System.out.println("Student name :"+studentName );
		System.out.println("student Age:"+studentAge);
		
	}
	public static void main(String[] args) {
    Student s1;
    s1=new Student();
	s1.initInfo();
	s1.printInfo();	
	}
}