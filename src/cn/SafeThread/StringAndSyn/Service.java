package cn.SafeThread.StringAndSyn;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description: 验证在synchronized 代码快事不要用string 类型作为同步要求，
 * 因为string处如常量池中，相同string代表持有相同的锁
 *
 * @Date: Create in 21:37 2017/12/1
 */
public class Service {

    public static void print(String stringParam){
        try{

            synchronized (stringParam){

                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
