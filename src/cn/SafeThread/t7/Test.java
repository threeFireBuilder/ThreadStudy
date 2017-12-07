package cn.SafeThread.t7;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:49 2017/7/9
 */
public class Test {

    public static void main(String args[]){
        Task task = new Task();
        Mythread1 a = new Mythread1(task);
        a.start();
        Mythread2 b = new Mythread2(task);
        b.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long beginTime = CommonUtil.beginTime1;
        if(CommonUtil.beginTime2<CommonUtil.beginTime1){
            beginTime = CommonUtil.beginTime2;
        }
        long endTime = CommonUtil.endTime1;
        if(CommonUtil.endTime2>CommonUtil.endTime1){
            beginTime = CommonUtil.beginTime2;
        }
        System.out.println("最终耗时"+(endTime-beginTime)/1000);

    }
}
