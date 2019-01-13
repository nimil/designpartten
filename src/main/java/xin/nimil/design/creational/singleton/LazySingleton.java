package xin.nimil.design.creational.singleton;

import java.util.Objects;

/**
 * 懒汉式 单例模式
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/13
 * @Time:16:34
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}


    /**
     * 静态class文件
     *
     * 非静态相当于锁了内存中的对象
     *
     * synchronized 对于性能有一定的影响
     *
     *  @return
     */
    public static  LazySingleton getInstance(){
        if (Objects.isNull(lazySingleton)){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
