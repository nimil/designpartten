package xin.nimil.design.creational.singleton;

/**
 * 静态内部类单例方法
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/13
 * @Time:19:08
 */
public class StaticInnerClassSingleton {

    //私有构造方法是比不可少的
    private StaticInnerClassSingleton(){}

    //利用类的初始化锁
    private static class  InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton;
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

}
