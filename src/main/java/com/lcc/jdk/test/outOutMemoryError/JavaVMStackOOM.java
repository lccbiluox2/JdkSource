package com.lcc.jdk.test.outOutMemoryError;

public class JavaVMStackOOM {

    public void  dontStop(){
        while(true){

        }
    }

    public void stackLeakByThread(){
        while(true){
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }


    public  static void main(String[] args) throws Throwable{
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();



    }
}

/**
 *
 JVM参数 ：-Xss2M

 卡死啦

 */
