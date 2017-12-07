package cn.SafeThread.deadLockTest;

import cn.SafeThread.deadLockTest.*;


/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 21:52 2017/12/1
 */
public class Run {

    public static void main(String args[]) throws InterruptedException {


        DealThread t1 = new DealThread();
        t1.setFlag("a");
        Thread thread1 = new Thread(t1);
        thread1.start();
        Thread.sleep(100);
        t1.setFlag("b");
        Thread thread2 = new Thread(t1);
        thread2.start();

    }
}
