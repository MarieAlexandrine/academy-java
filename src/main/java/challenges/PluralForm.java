package challenges;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int amt;
		String word;
		
		System.out.println("Enter a positive number:  ");
		amt = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter a word in singular form: ");
		word = scanner.nextLine();
		
		
	
		if(amt == 1) {
			System.out.println(amt + " " + word);
		}
		
		if(word.endsWith("fe")) {
			int lastIndex = word.lastIndexOf("fe");
			word = word.substring(0,lastIndex).concat("ves");
			System.out.println(amt + " " + word);
		} else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
			word = word.concat("s");
			System.out.println(amt + " " + word);
		} else if (word.endsWith("y")) {
			int lastIndex = word.lastIndexOf("y");
			word = word.substring(0,lastIndex).concat("ies");;
			System.out.println(amt + " " + word);
		} else if (word.endsWith("sh") || word.endsWith("ch")) {
			word = word.concat("es");
			System.out.println(amt + " " + word);
		} else if (word.endsWith("us")) {
			int lastIndex = word.lastIndexOf("us");
			word = word.substring(0,lastIndex).concat("i");
			System.out.println(amt + " " + word);
		}  else {
			word = word.concat("s");
			System.out.println(amt + 	" " + word);
		}
		
		scanner.close(); 
	}

	
	
}
