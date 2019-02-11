package xin.nimil.design.strutual.proxy.DynamicProxy;

import xin.nimil.design.strutual.proxy.IOrderService;
import xin.nimil.design.strutual.proxy.Order;
import xin.nimil.design.strutual.proxy.OrderServiceImpl;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/11
 * @Time:20:30
 */
public class Test {

    public static void main(String[] args) {
        Order order  = new Order();
        order.setUserId(3);
        IOrderService orderServiceDynamicProxy = (IOrderService)new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
