package com.oops.thread;
class SharedQueue {
    private boolean ready = false;

    public synchronized void produce() throws InterruptedException {
        while (ready) wait(); // Wait until consumed
        System.out.println("Produced data");
        ready = true;
        notify(); // Signal consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!ready) wait(); // Wait until produced
        System.out.println("Consumed data");
        ready = false;
        notify(); // Signal producer
    }
}
