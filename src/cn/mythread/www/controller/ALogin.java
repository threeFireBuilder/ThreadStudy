package cn.mythread.www.controller;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 21:08 2017/6/21
 */
public class ALogin extends Thread{
    public void run(){
        LoginServlet.post("a","AA");
    }
}
