package com.lcc.jdk.test.gc;

public class testTenuringThreshold {

    private static final int _1MB = 1024*1024;

    public static void testAllocation(){
        byte[] allo1 ,allo2,allo3,allo4;
        allo1 = new byte[_1MB/4];
        allo2 = new byte[4*_1MB];
        allo3 = new byte[4*_1MB];
        allo3 = null;
        allo3 = new byte[4*_1MB];

        System.out.println("doing......");
    }

    public  static void main(String[] args) throws Throwable {
        testAllocation();
    }

}

/**
 *
 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8  -XX:MaxTenuringThreshold=1  -XX:+PrintTenuringDistribution


 doing......
 Heap
 PSYoungGen      total 9216K, used 6558K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
 eden space 8192K, 80% used [0x00000007bf600000,0x00000007bfc67888,0x00000007bfe00000)
 from space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
 to   space 1024K, 0% used [0x00000007bfe00000,0x00000007bfe00000,0x00000007bff00000)
 ParOldGen       total 10240K, used 8192K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
 object space 10240K, 80% used [0x00000007bec00000,0x00000007bf400020,0x00000007bf600000)
 Metaspace       used 3298K, capacity 4496K, committed 4864K, reserved 1056768K
 class space    used 368K, capacity 388K, committed 512K, reserved 1048576K

 Process finished with exit code 0








 -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8  -XX:MaxTenuringThreshold=15  -XX:+PrintTenuringDistribution


 doing......
 Heap
 PSYoungGen      total 9216K, used 6302K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
 eden space 8192K, 76% used [0x00000007bf600000,0x00000007bfc27878,0x00000007bfe00000)
 from space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
 to   space 1024K, 0% used [0x00000007bfe00000,0x00000007bfe00000,0x00000007bff00000)
 ParOldGen       total 10240K, used 8192K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
 object space 10240K, 80% used [0x00000007bec00000,0x00000007bf400020,0x00000007bf600000)
 Metaspace       used 3299K, capacity 4496K, committed 4864K, reserved 1056768K
 class space    used 368K, capacity 388K, committed 512K, reserved 1048576K

 Process finished with exit code 0



 */
