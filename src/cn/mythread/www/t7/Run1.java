package cn.mythread.www.t7;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 14:27 2017/6/25
 */
public class Run1 {
    public static void main(String args[]) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin==="+myThread.isAlive());
        myThread.start();
        myThread.sleep(1000);
        System.out.println("end==="+myThread.isAlive());
    }
}
