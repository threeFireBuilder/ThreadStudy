package cn.SafeThread.t1;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:06 2017/6/25
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNuum hasSelfPrivateNuum;

    public ThreadA(HasSelfPrivateNuum hasSelfPrivateNuum){
        this.hasSelfPrivateNuum = hasSelfPrivateNuum;
    }

    public void run(){
        super.run();
        hasSelfPrivateNuum.addI("a");
    }
}
