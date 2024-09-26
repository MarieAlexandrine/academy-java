import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string to check for palindrome: "); //Prompt the user input
        Scanner scanner = new Scanner(System.in); // create a scanner to read user input
        String input = scanner.nextLine(); // stores user input as a string variable on the next line
        String reverseInput = ""; // holds memory for the reversed version of user input

        for (int i = input.length() - 1; i >= 0; i--) { // the loop starts from the last character of the string & continues as long as i is greater than 0 decrementing i after each iteration
            reverseInput += input.charAt(i);  // we use decrements because we're checking the reversed version of the input
        } // for each iteration, the character at position i in the input string is added to the reverseInput giving us its string

        if (input.toLowerCase().equals(reverseInput.toLowerCase())) { // compares the original input to its reversed version -case sensitive
            System.out.println("Input string is palindrome");
        } else {
            System.out.println("Input string is not palindrome");
        }

	}

}
