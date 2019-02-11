package xin.nimil.design.strutual.proxy.staticproxy;

import xin.nimil.design.strutual.proxy.IOrderService;
import xin.nimil.design.strutual.proxy.Order;
import xin.nimil.design.strutual.proxy.OrderServiceImpl;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/11
 * @Time:19:45
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int  saveOrder(Order order){
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到"+dbRouter+"处理数据");

        //设置datasourse
        //根据不同的routing发往不同的datasource

        afterMethod();
        return 0;
    }


    private void beforeMethod(){
        System.out.println("静态代理before code");
    }

    private void afterMethod(){
        System.out.println("静态代理after code");
    }
}
