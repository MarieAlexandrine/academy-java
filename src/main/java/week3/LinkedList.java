package week3;

import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<String> namesLinkedList = new java.util.LinkedList<>();
		namesLinkedList.add("Marie");
		namesLinkedList.add("Alex");
		namesLinkedList.add("John");
		namesLinkedList.add("Sam");
		System.out.println(namesLinkedList.get(0));
//		namesLinkedList.remove(2);
		namesLinkedList.add(2, "Bill");
		namesLinkedList.set(0, "Axie");

		namesLinkedList.addFirst("Anna");
		System.out.println(namesLinkedList);
		Iterator<String> iterator = namesLinkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
