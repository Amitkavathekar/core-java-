package day8_3;

/**
 * The Circle class extends the abstract Shape class and provides a concrete
 * implementation for calculating the area of a circle.
 */
public class Circle extends Shape {

    // Constant for the value of Pi, used in area calculation
    private final double PI = 3.14;

    // The radius of the circle
    private double radius;
	
    /**
     * Constructor to initialize the Circle object with a specific radius.
     *
     * @param radius the radius of the circle.
     */
    public Circle(double radius) {
        super(); // Call to the superclass constructor (optional here)
        this.radius = radius; // Initialize the radius with the provided value
    }
		
    /**
     * This method overrides the abstract area() method from the Shape class.
     * It calculates and returns the area of the circle using the formula:
     * Area = Pi * radius^2.
     *
     * @return the area of the circle as a double.
     */
    @Override
    public double area() {
        return PI * (radius * radius);
    }
}
