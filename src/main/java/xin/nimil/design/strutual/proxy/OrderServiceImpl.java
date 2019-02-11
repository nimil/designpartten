package xin.nimil.design.strutual.proxy;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/11
 * @Time:19:41
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao ;

    @Override
    public int saveOrder(Order order) {
       iOrderDao = new OrderDaoImpl();
        System.out.println("service 调用dao层添加order");

        return iOrderDao.insert(order);
    }

}
