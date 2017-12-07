package cn.SafeThread.StringAndSyn;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 21:52 2017/12/1
 */
public class Run {

    public static void main(String args[]) throws InterruptedException {


        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(6000);

    }
}
