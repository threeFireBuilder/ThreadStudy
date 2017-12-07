package cn.SafeThread.StringAndSyn;

import cn.SafeThread.StringAndSyn.*;
import cn.SafeThread.StringAndSyn.Service;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 21:43 2017/12/1
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service){
        super();
        this.service = service;
    }

    public void run(){
        service.print("AA");
    }
}
