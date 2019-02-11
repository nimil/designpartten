package xin.nimil.design.strutual.proxy.DynamicProxy;

import xin.nimil.design.strutual.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/11
 * @Time:20:17
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target){
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,args);
        afterMethod();
        //顺便将返回值写会主流程
        return object;
    }

    private void afterMethod() {
        System.out.println("动态代理后置方法");
    }

    private void beforeMethod(Object obj){
        System.out.println("动态代理前置方法");
        int userId = 0;
        if (obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("当前sql被发往数据库"+dbRouter);
    }



}
