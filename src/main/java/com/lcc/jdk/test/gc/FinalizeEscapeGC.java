package com.lcc.jdk.test.gc;

public class FinalizeEscapeGC {

    public  static FinalizeEscapeGC SAVE_HOOK =null;

    public void  isAlive(){
        System.out.println(" still alive");
    }


    @Override
    public  void finalize() throws Throwable{

      super.finalize();
      System.out.println("finalize method is run ");
      FinalizeEscapeGC.SAVE_HOOK = this;
    }


    public  static void main(String[] args) throws Throwable{
        SAVE_HOOK = new FinalizeEscapeGC();

        SAVE_HOOK = null;
        System.gc();

        Thread.sleep(500);

        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("dead");
        }

        SAVE_HOOK = null;
        System.gc();

        Thread.sleep(500);

        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("dead");
        }


    }
}
/**

 finalize method is run
 still alive
 dead

 Process finished with exit code 0
        */
