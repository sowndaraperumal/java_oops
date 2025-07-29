package com.oops.thread;
class Warehouse {
    private String item;
    private boolean available = false;

    // Producer puts an item
    public synchronized void produce(String newItem) throws InterruptedException {
        while (available) {
            wait(); // wait if item is already present
        }
        this.item = newItem;
        System.out.println("Produced: " + item);
        available = true;
        notify(); // notify the consumer
    }

    // Consumer takes an item
    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); // wait if item is not ready
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify(); // notify the producer
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                String[] items = {"Apple", "Banana", "Carrot"};
                for (String item : items) {
                    warehouse.produce(item);
                    Thread.sleep(1000); // simulate time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    warehouse.consume();
                    Thread.sleep(1500); // simulate time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
