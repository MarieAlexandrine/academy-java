package com.bptn.course._week2;

//import java.util.InputMismatchException;
//import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
      Person person1 = new Person("John", "Doe", 1, 1, 1990, "123-45-6789");
      Person person2 = new Person("Jane", "Doe", 2, 2, 1991, "987-65-4321");
      Person person3 = new Person("Jane", "Smith", 1, 1, 1990, "111-11-1111");
      Person person4 = new Person("Jane", "Smith", 2, 2, 1991, "222-22-2222");
      
      System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName() + " Birthday: " + person1.getBirthday() + " SSN: " + person1.verifySSN("123-45-6789"));
      System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName() + " Birthday: " + person2.getBirthday() + " SSN: " + person2.verifySSN("987-65-4321"));
      System.out.println("Person 3: " + person3.getFirstName() + " " + person3.getLastName() + " Birthday: " + person3.getBirthday() + " SSN: " + person3.verifySSN("111-11-1111"));
      System.out.println("Person 4: " + person4.getFirstName() + " " + person4.getLastName() + " Birthday: " + person4.getBirthday() + " SSN: " + person4.verifySSN("222-22-2222"));
  }
}	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//	       // create an instance of Employee class and initialize it with salary = 100 and hoursPerDay = 8
//	       Employee student = new Employee(100, 8);
//	       
//	       // print the salary of the employee
//	       System.out.println(student.getSalary());
//	   }
//	}


//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		try {
//			System.out.println("How many elements do you want in the array?");
//			int count = scanner.nextInt();
//			int[] numbers = new int[count];
//			System.out.println("Enter " + count + " elements for the array: ");
//			for (int i = 0; i < count; i++) {
//				numbers[i] = scanner.nextInt();
//			}
//			System.out.println("Enter two more numbers for division: ");
//			int num1 = scanner.nextInt();
//			int num2 = scanner.nextInt();
//			int result = num1 / num2;
//			System.out.println("Element at index 10 is: " + numbers[10]);
//			System.out.println("Result: " + result);
//		}
//
//		catch (InputMismatchException e) {
//			System.out.println("Error: Please enter valid numbers!");
//		} catch (ArithmeticException e) {
//			System.out.println("Cannot divide by zero!");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("The array only contains  items");
//		} finally {
//			System.out.println("Program ended!");
//		}
//
//	}
//Throw class
//public static void main(String[] args) {
//
//
//	  // throw
//	  // throw new IllegalArgumentException
//	  double accountBalance = -500.00;
//	  try {
//	   checkBalance(accountBalance);
//	  } catch (IllegalArgumentException e) {
//	   System.out.println("Not enough money to withdraw!");
//	  }
//	 }
//
//
//	 public static void checkBalance(double balance) {
//	  if (balance < 0) {
//	   throw new IllegalArgumentException("Account balance cannot be negative");
//	  } else {
//	   System.out.println("Withdrawal successful!");
//	  }
//	 }
//}
//		      Car car = new Car("White", "Audi", "Chromecoloured");
//		      Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
////		      System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);
////		      System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);
//		      
//		     
//		     
//		      System.out.println(Integer.MIN_VALUE);
//		      System.out.println(Integer.MAX_VALUE);
//		      System.out.println(Integer.MIN_VALUE - 1);
//		      System.out.println(Integer.MAX_VALUE + 1);
//		  }
//	}