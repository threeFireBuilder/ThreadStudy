package cn.SafeThread.t6;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 12:14 2017/7/9
 */
public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub){
        super();
        this.sub = sub;
    }

    public void run(){
        super.run();
        sub.serviceMethod();
    }
}
