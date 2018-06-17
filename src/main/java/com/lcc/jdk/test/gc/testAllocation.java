package com.lcc.jdk.test.gc;

public class testAllocation {

    private static final int _1MB = 1024*1024;

    public static void testAllocation(){
        byte[] allo1 ,allo2,allo3,allo4;
        allo1 = new byte[2*_1MB];
        allo2 = new byte[2*_1MB];
        allo3 = new byte[2*_1MB];
        allo4 = new byte[4*_1MB];

        System.out.println("doing......");
    }

    public  static void main(String[] args) throws Throwable {
        testAllocation();
    }

}

/**
 *
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8

doing......
        Heap
        PSYoungGen      total 9216K, used 8192K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
        eden space 8192K, 100% used [0x00000007bf600000,0x00000007bfe00000,0x00000007bfe00000)
        from space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
        to   space 1024K, 0% used [0x00000007bfe00000,0x00000007bfe00000,0x00000007bff00000)
        ParOldGen       total 10240K, used 4096K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
        object space 10240K, 40% used [0x00000007bec00000,0x00000007bf000010,0x00000007bf600000)
        Metaspace       used 3299K, capacity 4496K, committed 4864K, reserved 1056768K
class space    used 368K, capacity 388K, committed 512K, reserved 1048576K

        Process finished with exit code 0
*/
