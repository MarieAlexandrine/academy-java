package com.bptn.course._week2;

class Car extends Vehicle /*extends Vehicle*/ {

	   String steeringWheel;

		// add parameterized constructor- use super keyword to call parent constructor
		public Car(String colour, String brand, String steeringWheel) {
			super(colour, brand);
			this.steeringWheel = steeringWheel;
		}

		public String getSteeringWheel() {
			return steeringWheel;
	  }
		
		public void print() {
			super.print();
			System.out.println(this.getSteeringWheel());
		}
}
//	private String steeringWheel;
//
//	// Step 2b: Define a parameterized constructor as per the specifications above
//	public Car(String color, String brand, String steeringWheel) {
//
//		super(color, brand);
//		this.steeringWheel = steeringWheel;
//	}
//
//	// Step 2c: Create a print() method as per the specifications above
//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Steering Wheel: " + this.steeringWheel);
//	}
//}
