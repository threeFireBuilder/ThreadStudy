package cn.SafeThread.t9;

import cn.SafeThread.t5.ThreadA;
import cn.SafeThread.t9.*;
import cn.SafeThread.t9.Mythread2;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 21:50 2017/11/30v
 */
public class Run {

    public static void main(String args[]) throws InterruptedException {


        MyOneList list = new MyOneList();
        Mythread1 mythread1 = new Mythread1(list);
        mythread1.setName("A");
        mythread1.start();

        Mythread2 mythread2 = new Mythread2(list);
        mythread2.setName("B");
        mythread2.start();
        Thread.sleep(6000);
        System.out.println(list.getSize());

    }
}
