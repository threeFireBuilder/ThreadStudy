package cn.SafeThread.t8;

import cn.SafeThread.t7.CommonUtil;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:43 2017/7/9
 */
public class Mythread1 extends Thread {

    private Task task;

    public Mythread1(Task task){
        super();
        this.task = task;
    }

    public void run(){
        super.run();
        task.doLongTask();
    }
}
