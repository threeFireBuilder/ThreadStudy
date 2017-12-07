package cn.SafeThread.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 22:18 2017/11/30
 */
public class MyOneList {

    private List list = new ArrayList();


    synchronized public void add(String data){
        list.add(data);
    }

    synchronized public int getSize(){

        return list.size();
    }
}
