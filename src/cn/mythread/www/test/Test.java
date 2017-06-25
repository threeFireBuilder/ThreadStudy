package cn.mythread.www.test;

import java.util.Date;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 8:57 2017/6/19
 */
public class Test {
    public static void main(String args[]){

        System.out.println(Thread.currentThread().getName());


        Date date = new Date();

       /* long a = date.getTime()+60*60*1000*24*30L;

        System.out.println(a);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(new Date(a)));



        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

        Calendar ca = Calendar.getInstance();
        ca.setTime(cal.getTime());

        ca.set(Calendar.DATE,ca.get(Calendar.DATE)+30);

        System.out.println(sdf.format(ca.getTime()));
        System.out.println(ca.getTime().getTime());



        String str = "122 23231sad";
        //String regx = "^(?![a-zA-Z]+$)(?![A-Z0-9]+$)(?![A-Z\\W_]+$)(?![a-z0-9]+$)(?![a-z\\W_]+$)(?![0-9\\W_]+$)[a-zA-Z0-9\\W_]{8,16}$";

        String regx = "/^\\S+$/gi";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(str);
        System.out.print(matcher.matches());*/


    }
}
