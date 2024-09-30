package challenges;

import java.util.Scanner; // Import the scanner class

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //scanner object to take input from the user
		char choice = 0;
		do {// the do-while loop ensures the program runs at least once and repeats  until user inputs an invalid operation or wishes not to continue.
			System.out.println("Choose from the following Calculator menu: ");//displays the calculator menu
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for substraction");
			System.out.println("Press 3 for  multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 to square a number");
			System.out.println("Press 6 to find a square root");
			System.out.println("Press 7 to find the reciprocal");

			
			int operation = scanner.nextInt(); //Reads the user's menu choice from above menu
			double result = 0;
			boolean validOperation = true;

			if (operation >= 1 && operation <= 4) { //Checks for binary operations 
				System.out.println("Enter the first number: "); 
				double num1 = scanner.nextDouble();

				System.out.println("Enter second number: ");
				double num2 = scanner.nextDouble();
// the if-else statements checks the selected binary operation and performs the corresponding operation 
				if (operation ==1) {
					result = num1 + num2;
					System.out.println("The sum is: " + result);

				}else if (operation==2) {
					result = num1 - num2;
					System.out.println("The change is: " + result);
				}else if (operation==3) {
					result = num1*num2;
					System.out.println("The product of " + num1  + "and" + num2 +"is: " +result );
				}else if (operation==4) {
					if (num2 !=0) { // condition to check for zero and prints error message if num2=0.
						result = num1/num2;
						System.out.println("Dividing " + num1 +"by " + num2 +"is: " + result);
					}else {
						System.out.println("Error: division by zero is invalid ");
					}

				}

//Check if unary operations and asks the user to input one number instead of two.
			}  else if (operation >= 5 && operation <= 7) { 
				System.out.print("Enter a number: ");
				double num =scanner.nextDouble();
//Perform the unary operation based on user input
				if (operation ==5) {
					result= num*num;
					System.out.println(num + "squared is :" + result);
				}else if (operation ==6) {
					if(num>=0) {//checks for positive number else it prints error message.
					result=Math.sqrt(num);
					System.out.println("The square root of " + num + "is: " + result);
					}else {
						System.out.println("Error: square root of a negative number is invalid. ");
					}
				}else if (operation ==7) {
				
					result = 1/num;
					System.out.println("The reciprocal of the number " +num +  " is : " + result);
				
				}
//if user input is out of the defined operations
			} else {
				System.out.println("Error: Invalid operation.");
				validOperation=false;
			}
//Ask if the user wish to perform another operation . if 'n' the loop terminates
			if (validOperation) {
				System.out.println("Do you wish to perform another operation? y/n");
				choice = scanner.next().charAt(0);

			}else {
				choice= 'n';
			}   


		} while (choice=='y' || choice=='Y'); //The loop continues if the user's choice is y or Y
		scanner.close(); // closes the Scanner to prevent resource leak.
		System.out.println("Calculator has ended. "); //message to end the program.
		
	}
}

























