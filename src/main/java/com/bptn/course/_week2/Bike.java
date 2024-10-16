package week2;

class Bike extends Vehicle /* Bike extends Vehicle*/ {

	  String bikeHandle;

		// add parameterized constructor- use super keyword to call parent constructor
		public Bike(String colour, String brand, String bikeHandle) {
			super(colour, brand);
			this.bikeHandle = bikeHandle;
		}

		public String getBikeHandle() {
			return bikeHandle;
	  }

		public void print() {
			super.print();
		}
	   
	}
//	private String bikeHandle;
//
//	// Step 3b: Define parameterized constructor for color, brand, bikeHandle
//	public Bike(String color, String brand, String bikeHandle) {
//
//		super(color, brand);
//		this.bikeHandle = bikeHandle;
//
//	}
//
//	// Step 3c: Create a print() method as per the specification in the above
//	
//	@Override
//	public void print() {
//	    System.out.println("I am Bike");
//	}
//}

