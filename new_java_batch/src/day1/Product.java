package day1;

public class Product {  // Class name should be capitalized
    int productId;
    String productName;
    double productNumber;

    void initInfo() {  // Consistent variable names
        productId = 10;
        productName = "hairoil";
        productNumber = 2002;
    }

    void printInfo() {  // Correct method and variable names
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Number: " + productNumber);
    }

    public static void main(String[] args) {
        Product p = new Product();  // Create an instance of Product
        p.initInfo();               // Initialize the info
        p.printInfo();              // Print the info
    }
}
