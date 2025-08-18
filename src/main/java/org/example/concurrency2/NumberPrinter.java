package org.example.concurrency2;

public class NumberPrinter implements Runnable {
    private int numberToPrint;

    NumberPrinter(int numberToPrint)
    {
        this.numberToPrint=numberToPrint;
    }

    public void run()
    {
        System.out.println(numberToPrint+"The current thread name : "+Thread.currentThread().getName());
    }
}
