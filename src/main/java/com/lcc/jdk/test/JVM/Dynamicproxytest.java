package com.lcc.jdk.test.JVM;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 9-1
 */
public class Dynamicproxytest {

    interface IHello{
        void sayHello();
    }

    static class  Hello implements  IHello{

        public void sayHello() {
            System.out.print("hellow word");
        }
    }


    static  class  Dynamicproxy implements InvocationHandler{

        Object originalObj;

        Object bind(Object originalObj){
            this.originalObj = originalObj;
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader()
            ,originalObj.getClass().getInterfaces(),this);
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.print("welcome ");
            return method.invoke(originalObj,args);
        }
    }


    public static void main(String[] args){
        IHello hello = (IHello) new Dynamicproxy().bind(new Hello());
        hello.sayHello();
    }


}
