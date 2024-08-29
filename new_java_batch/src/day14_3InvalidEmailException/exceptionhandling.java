package day14_3InvalidEmailException;

import java.util.Scanner;

public class exceptionhandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
            System.out.println("Email is valid.");
        } catch (EmailInvalidException e) {
            e.printStackTrace();
        }

        sc.close();
    }

    // Method to validate the email address
    public static void validateEmail(String email) throws EmailInvalidException {
        // Simple validation: check if email contains "@" and "."
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new EmailInvalidException();
        }
    }
}
