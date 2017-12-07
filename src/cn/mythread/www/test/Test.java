package cn.mythread.www.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
/*
        System.out.println(System.currentTimeMillis());
        System.out.println(1503418024);

        System.out.println(sdf.format(new Date(1503418024)) );*/

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




        Calendar calendar1 = Calendar.getInstance();

        calendar1.add(Calendar.MONTH,0);
        calendar1.add(Calendar.MONTH,2);
        calendar1.add(Calendar.MONTH,1);
        //calendar1.setTime(date);
        System.out.println(sdf.format(calendar1.getTime()));


        long l1 = System.currentTimeMillis();


        for(int i = 0;i<10000;i++){
            for (int j= 0;j<100;j++){
                int temp = i*j;
            }
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);

        System.out.println(calendar1.getTime());
        System.out.println(calendar1.get(Calendar.YEAR));

        System.out.println(calendar1.get(Calendar.MONTH));


        Calendar calendar2 = Calendar.getInstance();
       // calendar2.setTime(date2);


    }
}
