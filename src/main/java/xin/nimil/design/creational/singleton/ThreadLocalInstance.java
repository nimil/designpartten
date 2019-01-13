package xin.nimil.design.creational.singleton;

/**
 * threadLocal 线程安全类
 *
 * 保证同一线程的可见性
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/13
 * @Time:20:41
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadlocalins
            = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };


    private ThreadLocalInstance(){}

    public static ThreadLocalInstance getInstance(){
        return threadlocalins.get();
    }

}
