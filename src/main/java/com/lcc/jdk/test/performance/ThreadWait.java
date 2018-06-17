package com.lcc.jdk.test.performance;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 代码 4-9
 */
public class ThreadWait {

    public  static void createBusyThread(){
        Thread thread = new Thread(new Runnable() {
            public void run() {
                while (true)
                    ;
            }
        },"testBusyThread");
        thread.start();
    }

    public  static  void  createLocakThread(final Object lock){
        Thread thread = new Thread(new Runnable() {
            public void run() {
                synchronized (lock){
                    try{
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        },"testLockThread");
        thread.start();
    }

    public static  void main(String[] arga ) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        createBusyThread();
        br.readLine();
        Object obj = new Object();
        createLocakThread(obj);
    }

}
