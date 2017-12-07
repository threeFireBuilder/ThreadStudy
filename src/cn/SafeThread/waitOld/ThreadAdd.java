package cn.SafeThread.waitOld;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 23:34 2017/12/6
 */
public class ThreadAdd extends Thread {

    private Add p;

    public ThreadAdd(Add p){
        this.p = p;
    }

    public void run(){
        p.add();
    }
}
