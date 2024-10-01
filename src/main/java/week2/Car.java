package week2;

class Car { // class declaration
	private String color; // instance variables
	private String brand;
	private int price;
	
	public Car() {
        this.color = "Red";
        this.brand = "VW";
        this.price = 75000;
	}

	public Car(String color, String brand, int price) { // constructor
		this.color = color; // To refer to the instance variables
		this.brand = brand;
		this.price = price;
	}
	
	 void printCarDetails() {
		this.print();
	}

	private void print() { // instance method to print car details
		System.out.println(this.color + " " + this.brand + " " + this.price);
	}

	public static void main(String args[]) { // the main method for testing
		Car myCar = new Car("white", "BMW", 70000);// new object creation
		myCar.printCarDetails();// call to printDentails method to print
		Car myCar2 = new Car();
		myCar2.printCarDetails();
	}
}
