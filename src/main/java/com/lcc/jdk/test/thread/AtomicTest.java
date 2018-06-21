package com.lcc.jdk.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 13-4
 */
public class AtomicTest {

    public static AtomicInteger race = new AtomicInteger(0);

    public static void  increase(){
        race.incrementAndGet();
    }

    private static final int threads_count = 20;

    public static void main(String[] args) throws Exception{
        Thread[] threads = new Thread[threads_count];
        for(int i=0;i<threads_count;i++){
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int i=0;i<10000;i++){
                        increase();
                    }
                }
            });

            threads[i].start();
        }


        System.out.println(race);

        while (Thread.activeCount() > 1)
            Thread.yield();

        System.out.println(race);


    }

}
