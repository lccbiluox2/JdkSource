package com.lcc.jdk.test.source;


import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Map;

public class SourceTest {

    public static void main(String[] args){
        Map<String,Integer> aa= new HashMap<String,Integer>();

        for(int i=0;i<1000;i++){
            aa.put("aa"+i,i);
        }


        System.out.println(aa.size());
        System.out.println(aa.get("aa"));


    }
}
