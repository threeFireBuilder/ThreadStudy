package cn.SafeThread.t6;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 12:14 2017/7/9
 */
public class ThreadA extends Thread {
    private Sub sub;

    public ThreadA(Sub sub){
        super();
        this.sub = sub;
    }

    public void run(){
        super.run();
        sub.serviceMethod();
    }
}
