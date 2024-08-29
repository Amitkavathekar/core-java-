package day12_4userautiticate;
import java.util.Scanner;

public class User {

    private String username;
    private String password;

    // Constructor to initialize the username and password
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method to check if the entered credentials are correct
    public boolean authenticate() {
        return this.username.equals("seed infotech") && this.password.equals("seed infotech");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter username: ");
        String usernameInput = sc.nextLine();

        System.out.print("Enter password: ");
        String passwordInput = sc.nextLine();

        // Create a User object with the input
        User user = new User(usernameInput, passwordInput);

        // Authenticate the user
        if (user.authenticate()) {
            System.out.println("Access granted");
        } else {
            System.out.println("Try again");
        }
    }
}
