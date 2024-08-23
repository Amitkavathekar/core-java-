package day4_1;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		int [] arr1 = new int [5];
		arr1[0]=67;
		arr1[1]=89;
		arr1[2]=45;
		arr1[3]=34;
		arr1[4]=65;		
				
	  for (int i=0; i<arr1.length;i++) {
		  System.out.println(arr1[i]);
	  }
	  System.out.println("===========================================");
	  int []arr= {23,34,54,65,67};
	  
	  for(int i:arr) {
		System.out.println(i);
	}
	
}
}
