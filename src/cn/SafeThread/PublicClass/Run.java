package cn.SafeThread.PublicClass;

import javax.sql.rowset.spi.SyncResolver;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 20:07 2017/12/3
 */
public class Run {

    public static void main(String args[]){

        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("username");
        publicClass.setPassword("password");
        System.out.println(publicClass.getUsername()+"   ->  " +publicClass.getPassword());
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAddress("address");
        privateClass.setAge("age");
        System.out.print(privateClass.getAddress()+"->>>>>>>"+privateClass.getAge());
    }
}
