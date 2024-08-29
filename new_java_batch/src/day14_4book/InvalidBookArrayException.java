package day14_4book;

import java.util.Scanner;

import day14_2InvalidAgeException.copy.InvalidAgeException;

public class InvalidBookArrayException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Book[] books = new Book[5];

            for (int i = 0; i < books.length; i++) {
                System.out.println("Enter details for Book " + (i + 1) + ":");

                System.out.print("Book Name: ");
                String bookName = sc.nextLine();

                System.out.print("Author Name: ");
                String authorName = sc.nextLine();

                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();  // Consume newline left-over

                System.out.print("Book ID: ");
                int bookId = sc.nextInt();
                sc.nextLine();  // Consume newline left-over

                // Create a new book and add it to the array
                books[i] = new Book(bookName, authorName, price, bookId);
                System.out.println();
            }

            // Validate all books and print details
            for (Book book : books) {
                validateBook(book);
                book.displayBookDetails();
            }

        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    // Method to validate a book's details
    public static void validateBook(Book book) throws InvalidAgeException {
        if (book.getBookName() == null || book.getBookName().isEmpty() ||
            book.getAuthorName() == null || book.getAuthorName().isEmpty() ||
            book.getPrice() <= 0 || book.getBookId() <= 0) {
            throw new InvalidAgeException();
        }
    }
}
