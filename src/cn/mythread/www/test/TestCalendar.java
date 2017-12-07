package cn.mythread.www.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 20:43 2017/7/11
 */
public class TestCalendar {

    public static void main(String args[]){
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);

        String date1= "2018" ;

        SimpleDateFormat dft = new SimpleDateFormat("yyyy");

        /*System.out.println(dft.format(cal.getTime()));

        try {
            cal2.setTime(dft.parse(date1));

            *//*int result = cal.get(Calendar.MONTH)-cal2.get(Calendar.MONTH);*//*
            int month = cal.get(Calendar.YEAR)-cal2.get(Calendar.YEAR);

            System.out.println(month);
            System.out.println(month);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String lastMonth = dft.format(cal.getTime());
        String lastMonth1 = dft.format(cal2.getTime());
        System.out.println(lastMonth);
        System.out.println(lastMonth1);
*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        long date = 1499309581000L;
        System.out.println(sdf.format(new Date(new Long(date))));
        System.out.println(sdf.format(new Date()));

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        String date2 = (new SimpleDateFormat("yyyy-MM-dd")).format(calendar.getTime());
        System.out.println(date2);


        BigDecimal sum = BigDecimal.valueOf(5);
        System.out.println(sum.toString());
        sum = sum.add(BigDecimal.valueOf(6));
        System.out.println(sum);

    }
}
