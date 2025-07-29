package com.oops.thread;
import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            service.submit(() -> {
                System.out.println("Running task " + taskId + " in thread " + Thread.currentThread().getName());
            });
        }

        service.shutdown();
    }
}
