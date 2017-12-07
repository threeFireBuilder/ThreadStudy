package cn.SafeThread.t4;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 14:56 2017/7/9
 */
public class Sub extends Main {

    public void operateSubMethod(){

        try {
            while(i>0){
                i--;
                System.out.println("subprint i=" + i);
                Thread.sleep(1000);
                this.operateMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
