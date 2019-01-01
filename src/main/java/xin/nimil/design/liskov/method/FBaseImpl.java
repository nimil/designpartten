package xin.nimil.design.liskov.method;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:16:59
 */
public class FBaseImpl extends   Base {

    @Override
    public void method(HashMap hashMap) {
        super.method(hashMap);
        System.out.println("子类方法");
    }

    /**
     * 子类方法永远不会被执行
     *
     * 子类一定要比父类的入参方法更加的宽松
     * 如果不遵守会导致与预期的期望不一致
     *
     *
     * @param map
     */
    public void method(Map map){
        System.out.println("子类方法");
    }
}
