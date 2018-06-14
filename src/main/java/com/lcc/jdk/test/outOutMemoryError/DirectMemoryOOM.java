package com.lcc.jdk.test.outOutMemoryError;

import sun.misc.Unsafe;

import java.lang.reflect.Field;


public class DirectMemoryOOM {

    private static final  int _1M=1024*1024;

    public static void main(String[] args) throws  Exception{
        Field unsafeField = Unsafe.class.getDeclaredField("aa");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while(true){
            unsafe.allocateMemory(_1M);
        }
    }
}

/**
 *
Error:(13, 41) java: 无法将类 java.lang.Class<T>中的方法 getDeclaredField应用到给定类型;
        需要: java.lang.String
        找到: 没有参数
        原因: 实际参数列表和形式参数列表长度不同
 */
