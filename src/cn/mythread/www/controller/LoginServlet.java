package cn.mythread.www.controller;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 20:59 2017/6/21
 */
public class LoginServlet {

    public static String usernameRef;

    public static String passwordRef;

    synchronized public static void post(String username,String password){
        try{
            usernameRef = username;
            if ("a".equals(username)){
                Thread.sleep(1000);
            }
            passwordRef = password;
            System.out.println("username"+usernameRef+" password= "+passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
