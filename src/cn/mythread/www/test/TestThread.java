package cn.mythread.www.test;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 20:48 2017/6/21
 */
public class TestThread extends Thread {
    private int count = 5;

    public TestThread(String name){
        super();
        this.setName(name);
        count--;
        System.out.println("由"+Thread.currentThread().getName()+"计算到 count"+count);
    }

    public void run(){
        super.run();
        count--;
        System.out.println("由"+Thread.currentThread().getName()+"计算到 count"+count);
    }


}
