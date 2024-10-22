package com.bptn.course._week2;

public class Vehicle {

    String colour;
	  String brand;

  //add parameterized constructor
		public Vehicle(String colour, String brand) {
			  this.colour = colour;
			  this.brand = brand;
		}
	
		public String getColour() {
			return colour;
		}
	
		public String getBrand() {
			return brand;
		}
	
		public void print() {
			System.out.println(this.colour + " " +this.brand);
		}

	    //Do not modify this code as we have parameters that pass the test case
    public static void main(String[] args) {
        Car car = new Car("White", "Audi", "Chromecoloured");
        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
        car.print();
        	

    }
}




// Do not modify this code as we have parameters that pass the test case

////	private String color;
////	private String brand;
////
//////Step 1b: Define a parameterized constructor with color and brand as parameters
////	Vehicle(String color, String brand) {
////		this.color = color;
////		this.brand = brand;
////	}
////
//////Step 1c: Create a print() method as described in the above.
////	public void print() {
////		System.out.println(this.color + " " + this.brand);
//	}
//
//}
