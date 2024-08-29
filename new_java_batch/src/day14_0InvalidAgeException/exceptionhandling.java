
package day14_0InvalidAgeException;

import java.util.Scanner;

public class exceptionhandling {

    public static void main(String[] args) {
        // Corrected the Scanner initialization
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = sc.nextInt();

        // Check if the age is valid for voting
        if (age >= 18) {
            System.out.println("Vote here.\n1. BJP\n2. NCP");
        } else {
            try {
                // Throw the custom exception if age is less than 18
                throw new  InvlidAgeException();
            } catch ( InvlidAgeException e) {
                e.printStackTrace();
            }
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

