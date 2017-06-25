package cn.mythread.www;

/**
 * @Title:线程的调用具有随机性，start方法具有线程调度规划qi
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 8:46 2017/6/21
 */
public class MyThread extends Thread{

    public void run(){
        super.run();
        System.out.println("MyThreads");
    }
}
