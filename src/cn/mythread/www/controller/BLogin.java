package cn.mythread.www.controller;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 21:10 2017/6/21
 */
public class BLogin extends Thread {
    public void run(){
        LoginServlet.post("B","BB");
    }
}
