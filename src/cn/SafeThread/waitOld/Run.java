package cn.SafeThread.waitOld;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 23:32 2017/12/6
 */
public class Run {

    public static void main(String args[]) throws InterruptedException {

        Object lock = new Object();
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract subtract1 = new ThreadSubtract(subtract);
        subtract1.setName("sub1Thread");
        subtract1.start();
        ThreadSubtract subtract2 = new ThreadSubtract(subtract);
        subtract2.setName("sub2Thread");
        subtract2.start();
        Thread.sleep(1000);
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();


    }
}
