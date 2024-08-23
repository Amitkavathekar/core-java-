package day8_3;

/**
 * The Rectangle class extends the abstract Shape class and provides a concrete
 * implementation for calculating the area of a rectangle.
 */
public class Rectangle extends Shape {

    // The length of the rectangle
    private double length;
    
    // The height of the rectangle
    private double height;
	
    /**
     * Default constructor for Rectangle.
     * This constructor does not initialize any fields.
     * It is provided for cases where the rectangle dimensions may be set later.
     */
    public Rectangle() {
        // Default constructor with no initialization
    }
		
    /**
     * Parameterized constructor for Rectangle.
     * Initializes the length and height with the provided values.
     *
     * @param length the length of the rectangle.
     * @param height the height of the rectangle.
     */
    public Rectangle(double length, double height) {
        this.length = length;  
        this.height = height;  
    }

    /**
     * This method overrides the abstract area() method from the Shape class.
     * It calculates and returns the area of the rectangle using the formula:
     * Area = length * height.
     *
     * @return the area of the rectangle as a double.
     */
    @Override
    public double area() {
        return length * height;
    }

    /**
     * This is a static method that calculates the area of a rectangle
     * using integer dimensions. It is independent of any instance of the Rectangle class.
     *
     * @param i the length of the rectangle.
     * @param j the height of the rectangle.
     * @return the area as an integer, or 0 if not implemented.
     */
    public static double area1(int i, int j) {
        // This method is a placeholder and currently returns 0.
        // It could be implemented to calculate the area using integer inputs.
        return 0;
    }
}
