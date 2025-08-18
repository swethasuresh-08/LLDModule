package org.example.concurrency2;

import org.example.concurrency.HelloWorldPrinter;

public class Main {
    public static void main(String args[])
    {
        NumberPrinter hp=null;
        Thread thread=null;
        for(int i=1;i<=100;i++)
        {
            hp=new NumberPrinter(i);
            thread=new Thread(hp);
            thread.start();
        }
    }
}
