package challenges;
import java.util.Scanner;
public class WordEncryption {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String encrypted ="";
       
       System.out.println("Enter a word to encrypt: ");//prompt user input
       String word = scanner.nextLine();
       
       for (int i=0; i<word.length(); i++) { //looping  through each character in the input word
	       char chars = word.charAt(i);
	       if (chars >= 'a' && chars <='z'){ //checks if the character is a lower-case letter
	    	 char shiftedChar = (char)  ((chars - 'a' + 1)%26 + 'a');//shift the letter, wrap around from z to a using ASCII values
	    	 encrypted +=shiftedChar; //adds shifted letter to the encrypted string
	       } else if (chars>='A' && chars<='Z') { //Checks if the character is upper-case letter
	    	   char shiftedChar = (char)((chars - 'A' + 1)%26 + 'A'); //shift the letter, wrap around from z to a using ASCII values
	    	   encrypted +=shiftedChar; // adds shifted letter to the encrypted string
	    	   
	       } else {
	    	   encrypted += chars; // Adds unchanged character to the encrypted string
	       }
       }
       System.out.println("Encrypted word: " + encrypted); // prints the encrypted word
	}   
}
