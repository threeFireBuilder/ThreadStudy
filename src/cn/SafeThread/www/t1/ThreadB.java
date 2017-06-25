package cn.SafeThread.www.t1;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:06 2017/6/25
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNuum hasSelfPrivateNuum;

    public ThreadB(HasSelfPrivateNuum hasSelfPrivateNuum){
        this.hasSelfPrivateNuum = hasSelfPrivateNuum;
    }

    public void run(){
        super.run();
        hasSelfPrivateNuum.addI("b");
    }
}
