package com.lcc.jdk.test.gc;

public class testPretenureSizeThreshold {

    private static final int _1MB = 1024*1024;

    public static void testAllocation(){
        byte[] allo1;
        allo1 = new byte[4*_1MB];

        System.out.println("doing......");
    }

    public  static void main(String[] args) throws Throwable {
        testAllocation();
    }

}

/**
 *
 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728


 doing......
 Heap
 PSYoungGen      total 9216K, used 6302K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
 eden space 8192K, 76% used [0x00000007bf600000,0x00000007bfc27878,0x00000007bfe00000)
 from space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
 to   space 1024K, 0% used [0x00000007bfe00000,0x00000007bfe00000,0x00000007bff00000)
 ParOldGen       total 10240K, used 0K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
 object space 10240K, 0% used [0x00000007bec00000,0x00000007bec00000,0x00000007bf600000)
 Metaspace       used 3292K, capacity 4496K, committed 4864K, reserved 1056768K
 class space    used 365K, capacity 388K, committed 512K, reserved 1048576K

 Process finished with exit code 0


*/
