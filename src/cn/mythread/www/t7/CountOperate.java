package cn.mythread.www.t7;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 14:32 2017/6/25
 */
public class CountOperate extends Thread {

    public  CountOperate(){
        System.out.println("CountOperate--begin");
        System.out.println("Thread.currentThread().getName()"+Thread.currentThread().getName());
        System.out.println(""+Thread.currentThread().isAlive());
        System.out.println("this.getName"+this.getName());
        System.out.println("this.isAlive"+this.isAlive());
        System.out.println("CountOperate----end");
    }

    public void run(){
        System.out.println("run--begin");
        System.out.println("Thread.currentThread().getName()"+Thread.currentThread().getName());
        System.out.println(""+Thread.currentThread().isAlive());
        System.out.println("this.getName"+this.getName());
        System.out.println("this.isAlive"+this.isAlive());
        System.out.println("run----end");
    }

    public static void main(String args[]){
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        System.out.println("main begin t1"+thread.isAlive());
        thread.setName("a");
        thread.start();
        System.out.println("main begin t1"+thread.isAlive());

    }
}
