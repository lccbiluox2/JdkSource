package com.lcc.jdk.test.JVM;


/**
 * 8-15
 */
public class Test {

    class GrandFather{
        void thinking(){
            System.out.println("i am granfd father");
        }
    }


    class Father extends GrandFather{
        void thinking(){
            System.out.println("i am father");
        }
    }

    class  Son extends Father{
        void thinking(){
//            try{
//                MethodType mt = MethodType.methodType(void.class);
//                Pool.MethodHandle mh = Lookup().findSpecial(GrandFather.class,"thinking",mt,getClass());
//                mh.invoke(this);
//            }catch (Exception e){
//
//            }
        }
    }

}
