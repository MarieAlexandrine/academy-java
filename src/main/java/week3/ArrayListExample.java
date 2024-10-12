package week3;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // Access and print elements using a for-each loop
        System.out.println("Elements in the ArrayList:");
        for (int number : arrayList) {
            System.out.println(number);
        }

        // Update the element at index 2 (change 30 to 35)
        arrayList.set(2, 35);
        System.out.println("\nArrayList after updating index 2:");
        for (int number : arrayList) {
            System.out.println(number);
        }

        // Remove the element at index 1 (which is 20)
        arrayList.remove(1);
        System.out.println("\nArrayList after removing the element at index 1:");
        for (int number : arrayList) {
            System.out.println(number);
        }

        // Determine the size of the ArrayList
        int size = arrayList.size();
        System.out.println("\nThe size of the ArrayList is: " + size);
    }
}
