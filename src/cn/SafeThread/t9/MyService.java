package cn.SafeThread.t9;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 22:20 2017/11/30
 */
public class MyService {

    public MyOneList addMethod(MyOneList list,String data){

        try {
            synchronized (list){
                if(list.getSize()<1){

                    Thread.sleep(2000);
                    list.add(data);
                }
        }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }

}
