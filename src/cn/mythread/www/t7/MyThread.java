package cn.mythread.www.t7;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 14:26 2017/6/25
 */
public class MyThread extends Thread{

    public void run(){
        System.out.println("run  "+this.isAlive());
    }
}
