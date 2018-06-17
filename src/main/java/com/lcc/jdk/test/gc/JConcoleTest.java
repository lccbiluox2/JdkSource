package com.lcc.jdk.test.gc;

import java.util.ArrayList;
import java.util.List;

public class JConcoleTest {

    static class OOMObject{
        public byte[] placeholer = new byte[64*1024];
    }


    public static void fillHeap(int num) throws InterruptedException{
        List<OOMObject> list = new ArrayList<OOMObject>();
        for(int i=0;i<num;i++){
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public  static void main(String[] args) throws Throwable {
        fillHeap(10000);
    }
}


/**

 不设置

 objc[1319]: Class JavaLaunchHelper is implemented in both /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/
 Contents/Home/bin/java (0x10ad114c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home/jre
 /lib/libinstrument.dylib (0x10add94e0). One of the two will be used. Which one is undefined.

 Process finished with exit code 0


 设置

 -Xms100m -Xmx100m -XX:+UseSerialGC

 */