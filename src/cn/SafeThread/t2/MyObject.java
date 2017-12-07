package cn.SafeThread.t2;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 10:56 2017/7/9
 */
public class MyObject {
    public void methodA(){
        try{
            System.out.println("begin methodA threadName="
                    +Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void methodB(){
        try{
            System.out.println("begin methodB threadName="
                    +Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
