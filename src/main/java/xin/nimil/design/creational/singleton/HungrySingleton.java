package xin.nimil.design.creational.singleton;

import java.io.Serializable;
import java.util.Objects;

/**
 * 饿汉式单例模式
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/13
 * @Time:19:24
 */
public class HungrySingleton implements Serializable {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        if (Objects.nonNull(hungrySingleton)){
            //封堵通过反射调用生成对象  防止单例反射
            throw  new RuntimeException("单例构造器禁止反射调用");
        }

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //保证序列化重读后的对象保持一致 看源码
    //封锁通过反射生成对象的方法 序列化流的对象是反射调用此方法
    private Object readResolve(){
        return hungrySingleton;
    }
}
