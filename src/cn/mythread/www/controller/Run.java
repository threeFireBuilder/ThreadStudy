package cn.mythread.www.controller;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description: 测试类
 * @Date: Create in 21:11 2017/6/21
 */
public class Run {
    public static void main(String args[]){
        ALogin aLogin = new ALogin();
        aLogin.start();
        BLogin bLogin = new BLogin();
        bLogin.start();
    }
}
