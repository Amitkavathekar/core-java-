package day2;
//write a preograme to create class chair with any four attributes and accessor and mutator methods

	public class Chair {
	    // Attributes
	    private String material;
	    private String color;
	    private int legs;
	    private boolean hasArmrests;

	    // Constructor
	    public Chair(String material, String color, int legs, boolean hasArmrests) {
	        this.material = material;
	        this.color = color;
	        this.legs = legs;
	        this.hasArmrests = hasArmrests;
	    }

	    // Accessor Methods (Getters)
	    public String getMaterial() {
	        return material;
	    }

	    public String getColor() {
	        return color;
	    }

	    public int getLegs() {
	        return legs;
	    }

	    public boolean hasArmrests() {
	        return hasArmrests;
	    }

	    // Mutator Methods (Setters)
	    public void setMaterial(String material) {
	        this.material = material;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public void setLegs(int legs) {
	        this.legs = legs;
	    }

	    public void setHasArmrests(boolean hasArmrests) {
	        this.hasArmrests = hasArmrests;
	    }

	    // Main method to test the Chair class
	    public static void main(String[] args) {
	        // Creating a Chair object
	        Chair myChair = new Chair("Wood", "Brown", 4, true);

	        // Using Accessor methods
	        System.out.println("Material: " + myChair.getMaterial());
	        System.out.println("Color: " + myChair.getColor());
	        System.out.println("Legs: " + myChair.getLegs());
	        System.out.println("Has Armrests: " + myChair.hasArmrests());

	        // Using Mutator methods
	        myChair.setMaterial("Metal");
	        myChair.setColor("Black");
	        myChair.setLegs(3);
	        myChair.setHasArmrests(false);

	        // Displaying updated attributes
	        System.out.println("Updated Material: " + myChair.getMaterial());
	        System.out.println("Updated Color: " + myChair.getColor());
	        System.out.println("Updated Legs: " + myChair.getLegs());
	        System.out.println("Updated Has Armrests: " + myChair.hasArmrests());
	    }
	}
