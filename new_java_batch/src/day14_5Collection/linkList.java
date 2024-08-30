package day14_5Collection;

import java.util.LinkedList;

public class linkList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList link = new LinkedList();

        // Add elements to the LinkedList
        link.add("Apple");
        link.add("Banana");
        link.add("Cherry");

        // Add elements at specific positions
        link.addFirst("Mango"); // Adds at the beginning
        link.addLast("Date");   // Adds at the end

        // Display the LinkedList
        System.out.println("LinkedList: " + link);

        // Access elements
        System.out.println("First element: " + link.getFirst());
        System.out.println("Last element: " + link.getLast());
          
    }
}
