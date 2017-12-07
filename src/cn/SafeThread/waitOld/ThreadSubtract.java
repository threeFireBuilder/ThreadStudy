package cn.SafeThread.waitOld;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 23:34 2017/12/6
 */
public class ThreadSubtract extends Thread {

    private Subtract subtract;

    public ThreadSubtract(Subtract subtract){
        this.subtract = subtract;
    }

    public void run(){
        subtract.subtract();
    }
}
