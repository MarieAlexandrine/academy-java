package com.bptn.course._week5;

public class InsertionSort {
	public static void insertionSort(int[] arr) {

		if (arr == null || arr.length < 1) { // the method checks if the input array is null or has less than one
												// element. If true, the method returns immediately as there's no
												// sorting required.
			return;
		}
		// The for loop begins at index 1 (the second element), iterating through the
		// array to consider each element for sorting.
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
	}

	public static void main(String[] args) {
		// Initialize the array
		int[] arr = { 3, 4, 1, -2, 4, 8 };
		// Call the sort method to sort the array
		insertionSort(arr);
		// Print the sorted array
		System.out.print("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
