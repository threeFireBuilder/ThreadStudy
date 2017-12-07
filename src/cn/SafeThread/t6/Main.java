package cn.SafeThread.t6;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:20 2017/7/9
 */
public class Main {
    public synchronized void serviceMethod(){

        try {
            System.out.println(" int main 下一步 sleep begin threadName="
                    +Thread.currentThread().getName()+" time "
                    +System.currentTimeMillis());
            Thread.sleep(500);
            System.out.println(" int main 下一步 sleep end threadName="
                    +Thread.currentThread().getName()+" time "
                    +System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
