package cn.SafeThread.t3;

/**
 * @Title: start 与run 方法的区别  start 方法启动线城，而run方法则是在原有的线程中去执行操作
 * @Project:
 * @Author: zy
 * @Description: synchronized 添加在方法头时，写入的是关于对象的锁，因此在添加锁的方法  与其他的方法共享资源的时候，参与调用资源的
 * 方法也要添加上相应的锁，对方法进行控制，主要是对锁方法中的成员变量进行相关的控制，这样子才能有效的组织脏读
 * @Date: Create in 12:16 2017/7/9
 */
public class Test {

    public static void main(String args[]){

        try {
            PublicVar publicVar = new PublicVar();
            ThreadA a = new ThreadA(publicVar);
            a.start();
            Thread.sleep(5000);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
