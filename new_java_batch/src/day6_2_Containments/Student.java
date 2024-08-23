package day6_2_Containments;

import day4.MyDate; // Importing the MyDate class from the day4 package

public class Student {
    private int studId; 
    private String studName;
    private MyDate addmissionDate; 

    // Default constructor initializes the Student object with default values
    public Student() {
        studId = 101; 
        studName = "amit"; 
        addmissionDate = new MyDate();
    }

    // Parameterized constructor to initialize a Student object with specified values
    public Student(int studId, String studName, MyDate addmissionDate) {
        this.studId = studId; 
        this.studName = studName; 
        this.addmissionDate = addmissionDate; 
    }

    // Overridden toString method to return a string representation of the Student object
    @Override
    public String toString() {
        // Return a string with all the student details
        return "Student [studId=" + studId + ", studName=" + studName + ", addmissionDate=" + addmissionDate + "]";
    }
}
