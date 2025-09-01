package org.example.producerconsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> store;
    private String name;
    private int maxSize;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Producer(Queue<Object> store, String name, int maxSize,Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore=consumerSemaphore;
    }


    @Override
    public void run() {
        //Producer can produce infinite Shirts
        while (true) {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Producer " + this.name + " is Producing, Store size " + store.size());
            store.add(new Object());
            consumerSemaphore.release();

        }
    }
}