package week3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(10);
		nums.add(2);

		int val1 = 1;
		int val2 = 6;

		boolean isEqual = (!nums.get(val1).equals(nums.get(val2)));
		System.out.println(isEqual);
	}
}
//		Thread t1 = new Thread(new MyThread1());
//		Thread t2 = new Thread(new MyThread1());
//
//		t1.start();
//		t2.start();

//	
//		MyThread myThread = new MyThread(20);
//		myThread.start();

//Animal myAnimal = new Animal();
//Dog myDog = new Dog();
////Cat myCat = new Cat();
//
//myDog.sleep();
//myDog.sound();
