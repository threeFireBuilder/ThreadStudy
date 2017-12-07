package cn.SafeThread.t8;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:34 2017/7/9
 */
public class Task {


    public  void doLongTask(){


        synchronized (this){
            for(int i=0;i<100;i++){
                System.out.println("同步代码块 thread="+Thread.currentThread().getName()+"i="+i);
            }
        }

        System.out.println();

        for(int i=0;i<100;i++){
            System.out.println("非同步代码块 thread="+Thread.currentThread().getName()+"i="+i);
        }



    }
}
