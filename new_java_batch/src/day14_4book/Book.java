package day14_4book;

public class Book {
    private String bookName;
    private String authorName;
    private double price;
    private int bookId;

    // Constructor
    public Book(String bookName, String authorName, double price, int bookId) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
        this.bookId = bookId;
    }

    // Getters
    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public int getBookId() {
        return bookId;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}
