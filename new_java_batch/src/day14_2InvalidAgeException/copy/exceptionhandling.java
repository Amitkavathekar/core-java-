package day14_2InvalidAgeException.copy;

import java.util.Scanner;

import InvalidAgeException .InvalidAgeException;

public class exceptionhandling {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter ur age");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("vote here. \n1.INC \n2.Bjp");
			
		}else {
			try {
				throw new InvalidAgeException();
			}
			catch(Exception e) {
			//	e.printStackTrace();
				
				System.out.println(e.getMessage());
			
			}
		
			
		
	}
	
}

}