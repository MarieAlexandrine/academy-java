package week3;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		ArrayList<String> myBooks = new ArrayList<>();

		myBooks.add("Book1".toLowerCase());
		myBooks.add("Book2".toLowerCase());
		myBooks.add("Book3".toLowerCase());

		System.out.println("My fav books are: " + myBooks);
		for (String book : myBooks) {
			System.out.println("Book: " + book);
		}
		System.out.println(myBooks.getFirst());
		myBooks.remove(1);
		System.out.println("My fav books are: " + myBooks);
//Search for a book
		if (myBooks.contains("book3")) {
			System.out.println("book found");
		} else {
			System.out.println("book not found");
		}
		System.out.println(myBooks.get(myBooks.size()-1));//to display the last item
	}

}
