package cn.SafeThread.t4;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 14:54 2017/7/9
 */
public class Main {
    public int i = 10;

    public synchronized void operateMainMethod(){
        try{
            i--;
            System.out.println("mainprint i=" + i);
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
