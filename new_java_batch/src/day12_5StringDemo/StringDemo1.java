package day12_5StringDemo;

import java.util.Optional;

public class StringDemo1 {
	
	public static void main(String[] args) {
		String s = null;
		Optional<String>ofnull =Optional.ofNullable(s);
		
		if (ofnull.isPresent()) {
			System.out.println(s.length());}
		else {
				System.out.println("given word is null");
			}
		
		}
	
}

