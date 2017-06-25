package cn.mythread.www.t11;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 15:14 2017/6/25
 */
public class Run {
    public static void main(String args[]) {
        MyThread myThread = new MyThread();
        myThread.start();
        //myThread.sleep(1000);
        myThread.interrupt();  //单个使用interrput是无法停止线程的
//        Thread.currentThread().interrupt();
//        System.out.println("是否停止1？"+Thread.interrupted());
//        System.out.println("是否停止2？"+Thread.interrupted());
        System.out.println("是否停止3？" +myThread.interrupted());

        System.out.println("end");
    }
}
