package com.lcc.jdk.test.JVM;


/**
 * 8-6
 */
public class StaticDispatch {

    static abstract class Human{}

    static class Man extends Human{}

    static class Woman extends Human{}


    public void  sayHello(Human guy){
        System.out.println("hellow guy ");
    }

    public void  sayHello(Man guy){
        System.out.println("hellow man ");
    }

    public void  sayHello(Woman guy){
        System.out.println("hellow woman ");
    }

    public static  void  main(String[] args){
        Human man  = new Man();
        Human woman = new Woman();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);
        sr.sayHello(woman);
    }

}
