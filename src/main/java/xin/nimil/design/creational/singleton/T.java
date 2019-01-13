package xin.nimil.design.creational.singleton;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/13
 * @Time:16:38
 */
public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }
}
