package cn.SafeThread.t5;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 15:50 2017/7/9
 */
public class Service {

    public synchronized void testMethod(){
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("Thread="+Thread.currentThread().getName()+
                    "run begin" +System.currentTimeMillis() );
            while(true){
                if((""+Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName="
                            +Thread.currentThread().getName()
                            +"run exception="
                            +System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else {
            System.out.println("ThreadB run time="
                    +System.currentTimeMillis());
        }
    }
}
