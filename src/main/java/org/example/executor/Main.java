package org.example.executor;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String args[])
    {
//        NumberPrinter hp=null;
//        Thread thread=null;
//        for(int i=1;i<=100;i++)
//        {
//            hp=new NumberPrinter(i);
//            thread=new Thread(hp);
//            thread.start();
//        }
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++)
        {
            NumberPrinter numberPrinter=new NumberPrinter(i);
            executorService.submit(numberPrinter);
        }
        executorService.shutdown();
    }
}
