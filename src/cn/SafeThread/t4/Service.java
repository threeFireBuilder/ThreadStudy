package cn.SafeThread.t4;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 12:52 2017/7/9
 */
public class Service {
    
    public synchronized void service1(){
        System.out.println("service1");
        service2();
    }

     public synchronized void service2() {
        System.out.println("Service2");
        service3();
    }

    public synchronized void service3() {
        System.out.println("Service3");

    }
}
