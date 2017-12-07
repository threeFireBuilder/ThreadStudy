package cn.SafeThread.t4;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 12:55 2017/7/9
 */
public class MyThread extends Thread {

    public void run(){
        /*Service service = new Service();
        service.service1();*/
        Sub sub = new Sub();
        sub.operateSubMethod();
    }
}
