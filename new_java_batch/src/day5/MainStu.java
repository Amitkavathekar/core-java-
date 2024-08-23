package day5;

import java.util.Scanner;
public class MainStu {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Id :");
		 String  studentId=sc.next();
		 
		 System.out.println("Enter Student Name :");
		 String studentName=sc.next();
		 
		 System.out.println("Enter Student Address :");
		 String studentAddress=sc.next();
	
		 System.out.println("Student from Abc collage institude yes/no.");
		 String op=sc.next();
		 op.toLowerCase();
		 if(op.equals("yes")) {
		Student s=new Student(studentId,studentName,studentAddress);
		System.out.println(s);
		 }else if(op.equals("no")) {
			 System.out.println("Enter Student CollegeName :");
			 String collegeName=sc.next();
			 
		Student s1=new Student(studentId,studentName,studentAddress,collegeName);
		
		System.out.println(s1);
		
		 }
		 else {
		    System.out.println("Invalid");
		 }
	}
	
}
