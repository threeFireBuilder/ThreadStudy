package cn.SafeThread.waitOld;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 23:28 2017/12/6
 */
public class Subtract {

    private Object lock;

    public Subtract(Object lock){
        this.lock = lock;
    }

    public void subtract(){


        try{
            synchronized (lock){
                if(ValueObject.list.size() == 0){

                    System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName="+Thread.currentThread().getName());

                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
