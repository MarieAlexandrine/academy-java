package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		// fill these in with silly words/strings (don't read the poem yet)
        String pluralnoun1 = "Eyes";
        String pluralnoun2 = "Eggs";
        String color1 ="White";
        String color2 ="Yellow";
        String food ="Pizza";
        String message1 = "This is a test";

        //To pass the test case let us assume the food will be "Pizza"

        // Run to see the silly poem!
        System.out.println("Roses are " + color1);
        System.out.println(pluralnoun1 + " are " + color2);
        System.out.println("I like " + food);
        System.out.println("Do " + pluralnoun2 + " like them too?");
        System.out.println(color2.length());
        System.out.println(color2.substring(0,4));
        System.out.println(color2.indexOf("o"));
        System.out.println(message1.length());
        System.out.println(message1.substring (0,3));
        System.out.println(message1.indexOf ("is"));
        System.out.println(message1.substring(5));
        System.out.println(message1.indexOf ("Hello"));
        String s1 = "Miss you!";
        int len = s1.length();
        System.out.println(len);
        // Now come up with your own silly poem!
	}
}
