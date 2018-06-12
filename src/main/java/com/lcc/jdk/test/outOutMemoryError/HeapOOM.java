package com.lcc.jdk.test.outOutMemoryError;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    static class OOMObject{

    }

    public  static void main(String[] args){
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true){
            list.add(new OOMObject());
        }
    }
}

/**
 在IDEA==>run ==>edit config  ==> -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError


 运行结果

 java.lang.OutOfMemoryError: Java heap space
 Dumping heap to java_pid27420.hprof ...
 Heap dump file created [27843457 bytes in 0.218 secs]
 Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 at java.util.Arrays.copyOf(Arrays.java:3210)
 at java.util.Arrays.copyOf(Arrays.java:3181)
 at java.util.ArrayList.grow(ArrayList.java:261)
 at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
 at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
 at java.util.ArrayList.add(ArrayList.java:458)
 at com.lcc.jdk.test.outOutMemoryError.HeapOOM.main(HeapOOM.java:16)

 Process finished with exit code 1


 */