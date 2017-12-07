package cn.SafeThread.t5;

import cn.SafeThread.t3.PublicVar;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 12:14 2017/7/9
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service){
        super();
        this.service = service;
    }

    public void run(){
        super.run();
        service.testMethod();
    }
}
