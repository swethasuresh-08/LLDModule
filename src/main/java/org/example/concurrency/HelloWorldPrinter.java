package org.example.concurrency;

public class HelloWorldPrinter implements Runnable {
//Task Creation
    @Override
    public void run() {
        //Write a code that need to be executed from seperate thread
        System.out.println("Hello World : Thread Name = "+Thread.currentThread().getName());
    }
}
