package cn.SafeThread.t1;

/**
 * @Title:
 * @Project:
 * @Author: zy
 * @Description:
 * @Date: Create in 16:08 2017/6/25
 */
public class Run {
    public static void main(String args[]){
        HasSelfPrivateNuum hasSelfPrivateNuum = new HasSelfPrivateNuum();
        HasSelfPrivateNuum hasSelfPrivateNuum2 = new HasSelfPrivateNuum();
        ThreadA a = new ThreadA(hasSelfPrivateNuum);
        a.start();
        ThreadB b = new ThreadB(hasSelfPrivateNuum2);
        b.start();
    }
}
