package day14_5Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day11_1interface.mainapp;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(34);
		arr.add("ramesh");
		arr.add(34.25);
		arr.add(65);
		arr.add(87);

		
		Iterator itr =arr.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
			
		}
	}
}
