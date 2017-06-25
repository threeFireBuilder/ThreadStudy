package cn.mythread.www.mythread;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 8:54 2017/6/21
 */
public class MyThread extends Thread{
    public void run(){
        try {
             for (int i=1;i<10;i++){
                 int time = (int)(Math.random()*1000);
                 Thread.sleep(time);
                 System.out.println("run="+Thread.currentThread().getName());
             }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
