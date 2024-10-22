package com.bptn.course._week3;

public class MyThread1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName());
		}

	}

}
