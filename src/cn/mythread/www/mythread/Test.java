package cn.mythread.www.mythread;

/**
 * @Title:线程的运行具有随机性
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 9:08 2017/6/21
 */
public class Test {
    public static void main(String args[]){
        try {
            MyThread thread = new MyThread();
            thread.setName("Thread");
            thread.start();
            for (int i=1;i<10;i++){
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
