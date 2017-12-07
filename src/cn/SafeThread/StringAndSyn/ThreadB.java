package cn.SafeThread.StringAndSyn;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 21:43 2017/12/1
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service){
        super();
        this.service = service;
    }

    public void run(){
        service.print("AA");
    }



}
