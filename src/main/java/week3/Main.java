package week3;

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread1());

		t1.start();
		t2.start();

//	
//		MyThread myThread = new MyThread(20);
//		myThread.start();

	}

}

//Animal myAnimal = new Animal();
//Dog myDog = new Dog();
////Cat myCat = new Cat();
//
//myDog.sleep();
//myDog.sound();
