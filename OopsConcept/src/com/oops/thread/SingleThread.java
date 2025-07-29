package com.oops.thread;

public class SingleThread extends Thread {

	public void run() {
		System.out.println("Thread running: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		SingleThread t1 = new SingleThread();
		t1.start(); // Start a new thread
	}

}
