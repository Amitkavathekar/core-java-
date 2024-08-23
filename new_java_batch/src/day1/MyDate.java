package day1;

public class MyDate {
    int date;
    String month;
    double year;

    void initInfo() {
        date = 22;
        month = "Jan";
        year = 2002;
    }

    void printInfo() {
        System.out.println("Current date: " + date);
        System.out.println("Current month: " + month);
        System.out.println("Current year: " + year);
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate();  // Create an instance of MyDate
        myDate.initInfo();             // Initialize the info
        myDate.printInfo();            // Print the info
    }
}


