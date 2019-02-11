package xin.nimil.design.strutual.proxy.staticproxy;

import xin.nimil.design.strutual.proxy.Order;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/11
 * @Time:19:57
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();

        order.setUserId(79);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);

    }

}
