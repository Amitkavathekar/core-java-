package day8_3;

public class Mainclass {
	
    public static void main(String[] args) {
        // Create an instance of Circle using the Shape reference
        Shape s = new Circle(32);
        
        // Calculate and print the area of the circle
        double area = s.area();
        System.out.println("The area of the circle: " + area);
        
        // Create an instance of Rectangle using the Shape reference
        Shape s1 = new Rectangle(20, 30);
        
        // Calculate and print the area of the rectangle
        double area1 = s1.area();
        System.out.println("The area of the Rectangle: " + area1);
    }
}
