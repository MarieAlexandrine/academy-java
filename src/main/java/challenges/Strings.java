package challenges;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu;
		boolean choice=true;

		do {
			System.out.println("String menu: ");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to reverse a String");
			System.out.println("Press 3 to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 to Calculate the Length of String");
			System.out.print("Enter the option: ");

			menu = scanner.nextInt();
			scanner.nextLine();
		
			
		
			
			
				

				if (menu == 1) {
					System.out.println("Enter a string: ");
					String reverseInput = "";
					String input = scanner.nextLine(); //// stores user input as a string variable on the next line
					for (int i = input.length() - 1; i >= 0; i--) { // the loop starts from the last character of the string & continues as long as i is greater than 0 decrementing i after each iteration
						reverseInput += input.charAt(i);  // we use decrements because we're checking the reversed version of the input
					} // for each iteration, the character at position i in the input string is added to the reverseInput giving us its string

					if (input.toLowerCase().equals(reverseInput.toLowerCase())) { // compares the original input to its reversed version -case sensitive
						System.out.println(input + " is a palindrome");
					} else {
						System.out.println(input + " is not palindrome");
					}
				} else if (menu==2) {
					System.out.println("Enter a string: ");
					String reverseInput = "";
					String input = scanner.nextLine(); //// stores user input as a string variable on the next line
					for (int i = input.length() - 1; i >= 0; i--) {
						 reverseInput += input.charAt(i); 
					}	 
					System.out.println(reverseInput + " in reverse is: " + reverseInput);
					
				} else if (menu==3) {
					System.out.println("Enter First string: ");
					String string1 = scanner.nextLine();
					System.out.println("Enter Second string: ");
					String string2 = scanner.nextLine();
		
						String result = string1 + string2;
						System.out.println(result);

					}else if (menu==4) {
						System.out.println("Enter First string: ");
						String str1 = scanner.nextLine();
						System.out.println("Enter Second string: ");
						String str2 = scanner.nextLine();
						
						if(str1==str2) {
							System.out.println("The entered strings are equal ");
						}else {
							System.out.println("The entered strings are not equal ");
						}
					}else if (menu==5) {
					System.out.println("Enter a string: ");
					String length = scanner.nextLine();
					System.out.println("The length of the entered string is: " + length.length());
				
					}else {
				System.out.println("Invalid choice! Please make a valid choice.");
				choice = false;
				

			} 

			
		  


		} 
		while (choice==true);
		scanner.close();

		System.out.println("Exit");


	}
}
