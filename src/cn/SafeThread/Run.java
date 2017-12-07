package cn.SafeThread;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 22:08 2017/12/3
 */
public class Run {

    public static void main(String[] args){
        MyThread[] myThreads = new MyThread[100];
        for(int i=0;i<100;i++){
            myThreads[i] = new MyThread();
        }
        for(int i=0;i<100;i++){
            myThreads[i].start();
        }
    }
}
