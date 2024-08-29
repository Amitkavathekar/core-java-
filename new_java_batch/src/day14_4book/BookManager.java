package day14_4book;

public class BookManager extends Exception {

    // Constructor for the custom exception
    public BookManager() {
        super("Invalid book details provided!");
    }

    // Constructor that accepts a custom message
    public BookManager(String message) {
        super(message);
    }
}
