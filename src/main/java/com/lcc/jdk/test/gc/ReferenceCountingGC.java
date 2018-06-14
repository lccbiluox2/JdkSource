package com.lcc.jdk.test.gc;

public class ReferenceCountingGC {

    public  Object instance = null;

    private static  final int _1M = 1024*1024;

    private byte[] bigSize = new byte[2*_1M];

    public static void testGC(){

        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        System.gc();
    }


    public  static void main(String[] args) throws Throwable{
        testGC();
    }
}
/**
objc[5044]: Class JavaLaunchHelper is implemented in both
        /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/bin/java
        (0x10bd484c0) and
        /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre/lib/libinstrum
        ent.dylib (0x10cdb34e0). One of the two will be used. Which one is undefined.

        */
