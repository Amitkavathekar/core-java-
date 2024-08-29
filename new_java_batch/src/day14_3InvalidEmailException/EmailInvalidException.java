package day14_3InvalidEmailException;

public class EmailInvalidException extends Exception {

    // Constructor for the custom exception
    public EmailInvalidException() {
        super("The email address provided is invalid!");
    }

    // Constructor that accepts a custom message
    public EmailInvalidException(String message) {
        super(message);
    }
}
