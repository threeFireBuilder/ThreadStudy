package cn.SafeThread.t4;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 13:05 2017/7/9
 */
public class Test implements Runnable {

    public synchronized void get(){
        System.out.println(Thread.currentThread().getId());
        set();
    }

    public void set(){
        System.out.println(Thread.currentThread().getId());
    }

    public void run(){
        get();
    }

    public static void main(String args[]){
        Test t = new Test();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }

}
