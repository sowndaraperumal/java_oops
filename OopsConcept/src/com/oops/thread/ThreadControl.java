package com.oops.thread;

public class ThreadControl {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			try {
				Thread.sleep(3000); // sleeps for 2 sec
				System.out.println("T1 done");
			} catch (InterruptedException e) {
			}
		});

		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(3000); // sleeps for 2 sec
				System.out.println("T2 done");
			} catch (InterruptedException e) {
			}
		});
		
		
		t1.start();
		
		t1.join(); // main waits for t1 to finish
		System.out.println("Main thread continues1");
		
		t2.start();
		t2.join();
		System.out.println("Main thread continues2");

		

		
	}
}
