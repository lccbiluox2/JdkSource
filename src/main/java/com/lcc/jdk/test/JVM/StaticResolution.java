package com.lcc.jdk.test.JVM;


public class StaticResolution {

    public static void sayHello(){

        System.out.print("aa");

    }

    public static void main(String[] args){
        StaticResolution.sayHello();
    }

}