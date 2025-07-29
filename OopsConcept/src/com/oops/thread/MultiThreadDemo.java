package com.oops.thread;
public class MultiThreadDemo implements Runnable {
    private String taskName;

    public MultiThreadDemo(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(taskName + " started by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiThreadDemo("Download"));
        Thread t2 = new Thread(new MultiThreadDemo("Upload"));
        Thread t3 = new Thread(new MultiThreadDemo("Compress"));

        t1.start();
        t2.start();
        t3.start();
    }
}
