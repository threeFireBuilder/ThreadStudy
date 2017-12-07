package cn.SafeThread.t10;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 21:26 2017/12/3
 */
public class Run {

    public static void main(String args[]){

        PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.print("我要停止他  "+Thread.currentThread().getName());
        printString.setFlag(false);

    }
}
