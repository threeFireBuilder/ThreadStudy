package cn.mythread.www.test;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 20:33 2017/6/21
 */
public class MyThread extends Thread{

    private int count = 5;

    public MyThread(String name){
        super();
        this.setName(name);
    }

    public synchronized void run(){
        super.run();
        while(count>0){
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算,count="+count);
        }

    }
}
