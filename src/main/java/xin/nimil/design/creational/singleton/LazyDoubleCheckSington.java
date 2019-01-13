package xin.nimil.design.creational.singleton;

import java.util.Objects;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/13
 * @Time:18:50
 */
public class LazyDoubleCheckSington {

    //禁止指令重排序 将当前线程的对象地址可用
    private volatile static LazyDoubleCheckSington lazyDoubleCheckSington;

    private LazyDoubleCheckSington(){}

    public static LazyDoubleCheckSington getInstance(){
        if (Objects.isNull(lazyDoubleCheckSington)){
            synchronized (LazyDoubleCheckSington.class){
                if (Objects.isNull(lazyDoubleCheckSington)){
                lazyDoubleCheckSington = new LazyDoubleCheckSington();

                    //存在指令重排序问题
                    //1.分配内存给对象
                    //2.设置指向地址
                    //3.初始化对象
                    //intra-thread semantics

                }
            }
        }
        return lazyDoubleCheckSington;
    }

}
