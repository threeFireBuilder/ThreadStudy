package cn.SafeThread.AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 22:20 2017/12/3
 */
public class AddCountThread extends Thread {

    private AtomicInteger count = new AtomicInteger();

    public void run(){

        for(int i=0;i<1000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
