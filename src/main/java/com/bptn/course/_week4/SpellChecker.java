package com.bptn.course._week4;

import java.util.ArrayList;
import java.util.Collections;

public class SpellChecker {

	// Dictionary of correct words
	private static ArrayList<String> dictionary = new ArrayList<>();

	public static void main(String[] args) {
		// Add words to the dictionary
		dictionary.add("albatross");
		dictionary.add("elephant");
		dictionary.add("zebra");
		dictionary.add("antelope");
		dictionary.add("giraffe");

		// Sort dictionary for binary search
		Collections.sort(dictionary);

		// Words to spell check
		String[] wordsToCheck = { "albatross", "albatros", "elephant", "zebra", "zextra" };

		// Linear search: check each word and measure time
		System.out.println("Linear SpellCheck:");
		for (String word : wordsToCheck) {
			long startTime = System.nanoTime();
			boolean result = linearSpellCheck(word);
			long endTime = System.nanoTime();
			System.out.println("Word: '" + word + "', Result: " + result + ", Time: " + (endTime - startTime) + " ns");
		}

		// Binary search: check each word and measure time
		System.out.println("\nBinary SpellCheck:");
		for (String word : wordsToCheck) {
			long startTime = System.nanoTime();
			boolean result = binarySpellCheck(word);
			long endTime = System.nanoTime();
			System.out.println("Word: '" + word + "', Result: " + result + ", Time: " + (endTime - startTime) + " ns");
		}
	}

	// Linear spell check method
	public static boolean linearSpellCheck(String word) {
		for (String dictWord : dictionary) {
			if (dictWord.equals(word)) {
				return true;
			}
		}
		return false;
	}

	// Binary spell check method
	public static boolean binarySpellCheck(String word) {
		int index = Collections.binarySearch(dictionary, word);
		return index >= 0;
	}
}
