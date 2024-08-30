package day15_1_collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer>ts=new TreeSet<>();
		
		ts.add(12);
		ts.add(44);
		ts.add(2);
		ts.add(22);
		ts.add(23);
		
		for(Integer i:ts) {
			System.out.println(i);
		}
	}
	
}
