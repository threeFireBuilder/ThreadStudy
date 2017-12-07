package cn.SafeThread;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 22:03 2017/12/3
 */
public class MyThread extends Thread {

    volatile public static int count;

    synchronized private static void addCount(){

        for(int i=0;i<100;i++){
            count++;
        }
        System.out.println("count="+count);
    }

    public void run(){
        addCount();
    }

}
