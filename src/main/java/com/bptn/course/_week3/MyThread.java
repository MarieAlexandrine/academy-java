package com.bptn.course._week3;

public class MyThread extends Thread {
	int limitToStop;

	public MyThread(int limitToStop) {
		this.limitToStop = limitToStop;
	}

	public void run() {
		for (int i = 0; i <= limitToStop; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				try {
					Thread.sleep(1000);

				} catch (InterruptedException e) {
					e.printStackTrace();

				}
			}

		}
	}
}
