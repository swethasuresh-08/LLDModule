package org.example.producerconsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store=new ConcurrentLinkedDeque<>();
        int maxSize=6;
        Semaphore producerSemaphore=new Semaphore(maxSize);
        Semaphore consumerSemaphore=new Semaphore(0);

        Producer p1=new Producer(store,"P1",maxSize,producerSemaphore,consumerSemaphore);
        Producer p2=new Producer(store,"P2",maxSize,producerSemaphore,consumerSemaphore);
        Producer p3=new Producer(store,"P3",maxSize,producerSemaphore,consumerSemaphore);
        Producer p4=new Producer(store,"P4",maxSize,producerSemaphore,consumerSemaphore);
        Producer p5=new Producer(store,"P5",maxSize,producerSemaphore,consumerSemaphore);

        Consumer c1=new Consumer(store,"C1",maxSize,producerSemaphore,consumerSemaphore);
        Consumer c2=new Consumer(store,"C2",maxSize,producerSemaphore,consumerSemaphore);
        Consumer c3=new Consumer(store,"C3",maxSize,producerSemaphore,consumerSemaphore);

        //Not Sure of how many threads will be created so we use cached thread pool
        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.submit(p1);
        executorService.submit(p2);
        executorService.submit(p3);
        executorService.submit(p4);
        executorService.submit(p5);
        executorService.submit(c1);
        executorService.submit(c2);
        executorService.submit(c3);
    }
}
