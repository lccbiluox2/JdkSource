package com.lcc.jdk.test.JVM;


/**
 * 12 -1
 */
public class VolatileTest {

    public static volatile  int race = 0;

    public static void increase(){
        System.out.println(race);
        race++;
    }

    private static final int THREADS_COUNT =20;

    public static void main(String[] args){
        Thread[] threads = new Thread[THREADS_COUNT];

        for(int i=0;i<THREADS_COUNT;i++){
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int i=0;i<10000;i++){
                        increase();
                    }
                }
            });

            threads[i].start();
        }


        System.out.println(Thread.activeCount());

        while (Thread.activeCount() > 1){
            Thread.yield();
        }


        System.out.println(race);

    }


}
