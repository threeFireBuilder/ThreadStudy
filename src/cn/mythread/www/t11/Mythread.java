package cn.mythread.www.t11;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 15:12 2017/6/25
 */
public class MyThread extends Thread {

    public void run(){
        super.run();
        for(int i=0;i<50000;i++){
            System.out.println("i="+i+1);
        }
    }
}
