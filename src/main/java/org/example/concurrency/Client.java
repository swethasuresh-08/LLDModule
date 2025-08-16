package org.example.concurrency;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello "+Thread.currentThread().getName());
        //Task Object
        HelloWorldPrinter hp=new HelloWorldPrinter();
        //Create Thread and assign
        //Which task needs to be executed in thread
        Thread thread=new Thread(hp);
        thread.start();


    }
}
