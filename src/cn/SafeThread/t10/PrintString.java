package cn.SafeThread.t10;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 21:23 2017/12/3
 */
public class PrintString implements Runnable {

    private boolean isFlag = true;

    public boolean isFlag() {
        return isFlag;
    }

    public void setFlag(boolean flag) {
        isFlag = flag;
    }


    public void printStringMethod(){

        try{

            while(isFlag==true){
                System.out.print("run printStringMethod threadname="+Thread.currentThread().getName());
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
