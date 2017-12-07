package cn.SafeThread.t2;

/**
 * @Title: 每个对象都拥有一个对象锁，无论synchronized 关键字在类中那个地方引用，所lock到的都是类产生的对象本身
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 11:06 2017/7/9
 */
public class Run {
    public static void main(String args[]){
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
