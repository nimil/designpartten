package xin.nimil.design.creational.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器单例
 * 存在多线程安全隐患
 * 是一个平衡 需要综合业务考量
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/13
 * @Time:20:29
 */
public class ContainerSingleTon {

    //静态的concurrentHashMap 也非绝对的线程安全的
    public static Map<String,Object> stringObjectMap = new ConcurrentHashMap<>();

    public static void putInstance(String key,Object instance){
        if (!Objects.equals("",key) && Objects.nonNull(instance)){
            if (!stringObjectMap.containsKey(key)){
                stringObjectMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return stringObjectMap.get(key);
    }

}
