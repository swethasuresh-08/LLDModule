package org.example.producerconsumer;

import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Object> store;
    private String name;
    private int maxSize;

    Producer(Queue<Object> store, String name, int maxSize) {
        this.store = store;
        this.name = name;
        this.maxSize = maxSize;
    }


    @Override
    public void run() {
        //Producer can produce infinite Shirts
        while (true) {
            synchronized (store) {
                if (store.size() < maxSize) {
                    System.out.println("Producer " + this.name + " is Producing, Store size " + store.size());
                    store.add(new Object());
                }
            }
        }
    }
}