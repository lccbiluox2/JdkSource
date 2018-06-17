package com.lcc.jdk.test.gc;

public class MainTest {
    public  static void main(String[] args) throws Throwable {
        System.out.println("我在活着。。。。");
        System.gc();
        System.out.println("我要死了。。。。");
    }
}
