package cn.SafeThread.t5;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description: 结论：对象之间的线程具有隔离性，同步锁中出现异常会自动释放锁
 * @Date: Create in 16:05 2017/7/9
 */
public class Test {

    public static void main(String args[]){

        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            ThreadB b = new ThreadB(service);
            a.setName("a");
            a.start();
            Thread.sleep(5000);
            b.setName("B");
            b.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
