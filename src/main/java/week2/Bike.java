package week2;

public class Bike extends Vehicle {
	private String bikeHandle;

	// Step 3b: Define parameterized constructor for color, brand, bikeHandle
	public Bike(String color, String brand, String bikeHandle) {

		super(color, brand);
		this.bikeHandle = bikeHandle;

	}

	// Step 3c: Create a print() method as per the specification in the above
	
	@Override
	public void print() {
	    System.out.println("I am Bike");
	}
}

