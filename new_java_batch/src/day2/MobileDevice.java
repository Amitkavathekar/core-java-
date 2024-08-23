//write a program to create class mobile device with any four attributes and accersor and mutator methods
//package devices;
package day2;

public class MobileDevice {
	private String brand; // Attributes of the MobileDevice class
	private String model;
	private double price;
	private int batteryCapacity;

	// Constructor to initialize the attributes
	public MobileDevice(String brand, String model, double price, int batteryCapacity) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.batteryCapacity = batteryCapacity;
	}

	// Accessor methods (getters)
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	// Mutator methods (setters)
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	// Method to display mobile device information
	public void displayInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: $" + price);
		System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
	}

	// Main method
	public static void main(String[] args) {
		// Creating an instance of MobileDevice
		MobileDevice myPhone = new MobileDevice("Apple", "iPhone 13", 999.99, 3095);

		// Displaying initial information
		myPhone.displayInfo();

		// Modifying some attributes using setter methods
		myPhone.setPrice(899.99);
		myPhone.setBatteryCapacity(4000);

		// Displaying updated information
		System.out.println("\nUpdated Mobile Device Information:");
		myPhone.displayInfo();
	}
}
