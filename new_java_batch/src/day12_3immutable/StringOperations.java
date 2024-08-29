package day12_3immutable;

public class StringOperations {

    private String s1;
    private String s2;
    private String s3;

    // Constructor to initialize the strings
    public StringOperations(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    // Method to concatenate s1 and s2
    public String concatenate() {
        return s1.concat(s2);
    }

    // Method to check equality between s2 and s3
    public boolean checkEqualityS2S3() {
        return s2.equals(s3);
    }

    // Method to check equality between s1 and s3
    public boolean checkEqualityS1S3() {
        return s1.equals(s3);
    }

    // Method to replace 'r' with 'R' in s3
    public String replaceCharInS3() {
        return s3.replace('r', 'R');
    }

    // Method to check if s1 contains a given substring
    public boolean containsInS1(String substring) {
        return s1.contains(substring);
    }

    // Method to check if s2 contains a given substring
    public boolean containsInS2(String substring) {
        return s2.contains(substring);
    }

    // Method to check if s1 contains "Hi"
    public boolean containsHiInS1() {
        return s1.contains("Hi");
    }

    // Main method to demonstrate the string operations
    public static void main(String[] args) {
        // Create an instance of StringOperations
        StringOperations stringOps = new StringOperations("Hello", "World", "World");

        // Demonstrating the string operations and printing only true or false
        System.out.println(stringOps.checkEqualityS2S3());         // true
        System.out.println(stringOps.checkEqualityS1S3());         // false
        System.out.println(stringOps.replaceCharInS3().equals("WoRld")); // true
        System.out.println(stringOps.containsInS1("Hel"));         // true
        System.out.println(stringOps.containsInS2("e"));           // false
        System.out.println(stringOps.containsHiInS1());            // false
    }
}
