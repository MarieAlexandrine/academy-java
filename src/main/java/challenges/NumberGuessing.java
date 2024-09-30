package challenges;

import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		
		       
		        final int targetNumber = 23;  // The number to guess is immutable
		        Scanner scanner = new Scanner(System.in);
		        int guess = 0;  // Initialize the guess to an invalid value outside the range
		       

		        // Game instructions
		        System.out.println("Welcome to the Number Guessing Game!");
	
		        System.out.println("Try to guess the correct number between 1 and 100!");

		        // Loop until the user guesses the correct number
		        while (guess != targetNumber) {
		            // Ask the user for their guess
		            System.out.print("Enter your guess: ");
		            guess = scanner.nextInt();  // Read the user's input
		          

		            // Check the guess and give feedback
		            if (guess < 1 || guess > 100) {
		                System.out.println("Please enter a number between 1 and 100.");
		            } else if (guess < targetNumber) {
		                System.out.println("Too low! Try again.");
		            } else if (guess > targetNumber) {
		                System.out.println("Too high! Try again.");
		            } else {
		                // Correct guess
		                System.out.println("Congratulations! You guessed the number correctly!");
		                
		            }
		        }

		        // Close the scanner to avoid resource leak
		        scanner.close();
		    }
		

	}


