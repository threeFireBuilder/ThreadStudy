package cn.SafeThread.t6;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:  synchronized 不具有可继承性
 * @Date: Create in 16:27 2017/7/9
 */
public class Test {
    public static void main(String args[]){

        try {
            Sub service = new Sub();
            ThreadA a = new ThreadA(service);
            ThreadB b = new ThreadB(service);
            a.setName("a");
            a.start();
            b.setName("B");
            b.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
