package com.bptn.course._week4;

public class FibonacciRecursion {

	// Recursive method to calculate the Fibonacci number
	public int calculateFibonacci(int n) {
		// Base case 1: Fibonacci(0) is 0

		if (n <= 0) {
			return 0;
			// Base case 2: Fibonacci(1) is 1
		} else if (n == 1) {
			return 1;
		}

		// For other values of n, calculate Fibonacci(n) recursively

		// Calculate Fibonacci(n - 1) using recursion
		int nMinus1 = calculateFibonacci(n - 1);

		// Calculate Fibonacci(n - 2) using recursion
		int nMinus2 = calculateFibonacci(n - 2);

		// Calculate Fibonacci(n) by summing the above two values
		int fibN = nMinus1 + nMinus2;

		return fibN; // Return the calculated Fibonacci value for n
	}

	public static void main(String[] args) {
		FibonacciRecursion fibRecursion = new FibonacciRecursion();

		// Example: calculating the 10th Fibonacci number
		int n = 10;
		int result = fibRecursion.calculateFibonacci(n);
		System.out.println("Fibonacci(" + n + ") = " + result);
	}
}
