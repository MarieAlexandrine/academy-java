package challenges;

public class Main1 {

	public static void main(String[] args) {
//		int num = 1;
//
//		while (num < 10) {
//			if (num % 2 == 0) {
//				System.out.println(num + " is even");
//			} else {
//				System.out.println(num + " is odd");
//
//			}
//			int i = num++;
//		}
//		System.out.println("I hope that helps!");
		Store store = new Store();
		try {
			store.purchase("apple", 10);
			System.out.println("Purchase successful!");
		} catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}
	}

}
