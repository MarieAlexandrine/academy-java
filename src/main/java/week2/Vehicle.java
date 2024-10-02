package week2;

public class Vehicle {
	private String color;
	private String brand;

//Step 1b: Define a parameterized constructor with color and brand as parameters
	Vehicle(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}

//Step 1c: Create a print() method as described in the above.
	public void print() {
		System.out.println(this.color + " " + this.brand);
	}

}
