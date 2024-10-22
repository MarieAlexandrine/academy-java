package com.bptn.course._week4;

import java.util.Arrays;

public class Main {
	public void Start() {

		int[] array = { 3, 6, 1, 4, 2, 9, 7, 8, 5, 0 };
		int key = 1;

		Arrays.sort(array);

		// sort array
		int result = binarySearch(array, key);

		// Print values in array after sort
		System.out.println(result);

	}

//	Given a sorted array named arr of n elements, write a function to search for a given element x in arr.
//	If the element is present, return the index of x in the array. 
//			If the element is not present, return -1. 
	int binarySearch(int arr[], int x) {
		// put your code here.
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;// to avoid integer overflow
			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.Start();
	}

}
