package cn.SafeThread.t3;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 12:14 2017/7/9
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar){
        super();
        this.publicVar = publicVar;
    }

    public void run(){
        super.run();
        publicVar.setValue("B","BB");
    }
}
