package day2;

public class Customer {
 // Attributes
 private String name;
 private int age;
 private String email;
 private String address;

 // Constructor
 public Customer(String name, int age, String email, String address) {
     this.name = name;
     this.age = age;
     this.email = email;
     this.address = address;
 }

 // Accessor Methods (Getters)
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public String getEmail() {
     return email;
 }

 public String getAddress() {
     return address;
 }

 // Mutator Methods (Setters)
 public void setName(String name) {
     this.name = name;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public void setAddress(String address) {
     this.address = address;
 }

 // Main method to test the Customer class
 public static void main(String[] args) {
     // Creating a Customer object
     Customer customer = new Customer("John Doe", 30, "johndoe@example.com", "123 Main St");

     // Using Accessor methods
     System.out.println("Name: " + customer.getName());
     System.out.println("Age: " + customer.getAge());
     System.out.println("Email: " + customer.getEmail());
     System.out.println("Address: " + customer.getAddress());

     // Using Mutator methods
     customer.setName(" amit ");
     customer.setAge(22);
     customer.setEmail("amitkavathekar123@gmail.com");
     customer.setAddress(" kupwad");

     // Displaying updated attributes
     System.out.println("Updated Name: " + customer.getName());
     System.out.println("Updated Age: " + customer.getAge());
     System.out.println("Updated Email: " + customer.getEmail());
     System.out.println("Updated Address: " + customer.getAddress());
 }
}
