package cn.SafeThread.www.t1;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:03 2017/6/25
 */
public class HasSelfPrivateNuum {
    private int num = 0;

    public void addI(String username){

        try {
            if(username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(1000);
            }else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username+"num ="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
