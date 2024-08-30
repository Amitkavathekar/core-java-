package day14_5Collection;

import java.util.LinkedList;

public class linkList2 {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList link = new LinkedList();

        link.add("ramayan");
        link.add("geeta");
        link.add("mahabharat");

        System.out.println("LinkedList: " + link);
        
        for(Object o:link) {
        	System.out.println(o);
        }
          
    }
}
