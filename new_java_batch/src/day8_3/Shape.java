package day8_3;

/**
 * The Shape class is an abstract class that represents a geometric shape.
 * It provides a template for calculating the area of various shapes.
 */
public abstract class Shape {
	
    /**
     * This is an abstract method that will be implemented by subclasses.
     * Each subclass will provide its own specific implementation to calculate
     * the area of that particular shape.
     * 
     * @return the area of the shape as a double.
     */
    public abstract double area();
}
