package com.bptn.course._week3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetM {

	public static void main(String[] args) {
		// creating a hashset
		HashSet<String> marieSet = new HashSet<>();
		marieSet.add("Montreal");
		marieSet.add("Vancouver");
		marieSet.add("Toronto");
		marieSet.add("Montreal");

//		System.out.println(marieSet);

//		// Using iterator to print each element
		Iterator<String> iterator = marieSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		boolean london = marieSet.add("London");
		System.out.println("A moment please: " + london);
		boolean vancouver = marieSet.add("Vancouver");
		System.out.println("Checking: " + vancouver);
		System.out.println(marieSet);

	}

}

//marieSet.remove("Vancouver");
////System.out.println(marieSet);
////System.out.println(marieSet.contains("Ottawa"));
