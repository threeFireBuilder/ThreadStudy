package cn.SafeThread.t2;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 10:58 2017/7/9
 */
public class ThreadA extends Thread{
    private MyObject object;

    public ThreadA(MyObject object){
        super();
        this.object = object;
    }

    public void run(){
        super.run();
        object.methodA();
    }
}
