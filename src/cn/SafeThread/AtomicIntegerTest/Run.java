package cn.SafeThread.AtomicIntegerTest;

import cn.SafeThread.MyThread;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 22:08 2017/12/3
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        CountThread addCountThread = new CountThread();
        //AddCountThread addCountThread = new AddCountThread();
        Thread t1 =  new Thread(addCountThread);
        t1.start();
        Thread t2 = new Thread(addCountThread);
        t2.start();
        Thread t3 = new Thread(addCountThread);
        t3.start();
        //
        // Thread.sleep(6000);
    }
}
