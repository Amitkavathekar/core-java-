package day15_3_Comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Mainapp {

	public static void main(String[] args) {
		
		List<Employee> earr=new ArrayList<Employee>();
		
		earr.add(new Employee(122,"ragav",232424.23));
		earr.add(new Employee(1334,"ragav",232424.23));
		earr.add(new Employee(134,"ragav",232424.23));
		earr.add(new Employee(145,"ragav",232424.23));
		earr.add(new Employee(544,"ragav",232424.23));
		
		Collections.sort((earr));
		//comparable gets in implements
		
		for(Employee e:earr) {
			System.out.println(e);
		}
		
		System.out.println("-------------------------------");
		
		Collections.sort(earr,new SortedByName());
		
		for(Employee e:earr) {
			System.out.println(e);
		}
		
	}
}
