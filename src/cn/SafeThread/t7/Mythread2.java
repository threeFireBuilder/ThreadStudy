package cn.SafeThread.t7;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:43 2017/7/9
 */
public class Mythread2 extends Thread {

    private Task task;

    public Mythread2(Task task){
        super();
        this.task = task;
    }

    public void run(){
        super.run();
        CommonUtil.beginTime2 = System.currentTimeMillis();
        task.doLongTask();
        CommonUtil.endTime2 = System.currentTimeMillis();
    }
}
