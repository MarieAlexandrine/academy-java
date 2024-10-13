package challenges;

public class Main {

	public static void main(String[] args) {

		// Create two SumCalculator threads to calculate the sum of two different ranges
		SumCalculator sumCalculator1 = new SumCalculator(1, 50);
		SumCalculator sumCalculator2 = new SumCalculator(51, 100);

		// Start both threads
		long startTime = System.currentTimeMillis();
		sumCalculator1.start();
		sumCalculator2.start();

		try {
			// Wait for both threads to finish using join() method of each thread.
			sumCalculator1.join();
			sumCalculator2.join();
		} catch (InterruptedException e) {
			// Print the stack trace if an interruption occurs
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		// Calculate the total sum by adding the sum of both ranges
		int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();
		long elapsedTime = endTime - startTime;

		// Print the total sum
		System.out.println("Total sum: " + totalSum);
		System.out.println("Elapsed time: " + elapsedTime);
	}

}
