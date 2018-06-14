package com.lcc.jdk.test.outOutMemoryError;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM2 {

    public  static void main(String[] args){
      String str1 = new StringBuffer("计算机").append("软件").toString();

      // 返回字符串对象的规范表示形式。
      System.out.println(str1.intern());
      System.out.println(str1.intern().toString());
      System.out.println(str1.intern() == str1);


      String str2 = new StringBuffer("ja").append("va").toString();
      System.out.println(str2.intern());
      System.out.println(str2.intern().toString());
      System.out.println(str2.intern() == str2);



    }

}

/**
 计算机软件
 计算机软件
 true

 java
 java
 false

 Process finished with exit code 0
 */