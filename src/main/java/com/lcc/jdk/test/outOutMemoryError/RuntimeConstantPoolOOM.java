package com.lcc.jdk.test.outOutMemoryError;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {

    public  static void main(String[] args){
        List<String> list = new ArrayList<String>();
        int i=0;
        while(true) {
            list.add(String.valueOf(i++).intern());

        }
    }

}

/**

 -XX:PerSize=10M -XX:MaxPerSize=10M

 Unrecognized VM option 'PerSize=10M'
 Error: Could not create the Java Virtual Machine.
 Error: A fatal exception has occurred. Program will exit.

 没有测试成功

 */