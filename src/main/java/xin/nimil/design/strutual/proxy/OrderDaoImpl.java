package xin.nimil.design.strutual.proxy;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/11
 * @Time:19:40
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.err.println("插入订单数据成功");
        return 0;
    }
}
