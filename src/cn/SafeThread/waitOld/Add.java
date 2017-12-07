package cn.SafeThread.waitOld;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 23:24 2017/12/6
 */
public class Add {


    private Object lock;

    public Add(Object lock){
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("aaaaa");
            lock.notifyAll();
        }


    }
}
