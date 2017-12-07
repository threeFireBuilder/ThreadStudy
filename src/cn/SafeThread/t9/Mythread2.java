package cn.SafeThread.t9;

import cn.SafeThread.t8.Task;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:43 2017/7/9
 */
public class Mythread2 extends Thread {

    private MyOneList list;

    public Mythread2(MyOneList list){
        super();
        this.list = list;
    }

    public void run(){
        MyService myService = new MyService();
        myService.addMethod(list,"B");
    }
}
