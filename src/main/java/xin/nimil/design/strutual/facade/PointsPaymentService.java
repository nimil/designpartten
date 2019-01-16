package xin.nimil.design.strutual.facade;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/16
 * @Time:20:59
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift){
        System.out.println("支付"+pointsGift.getName()+"积分成功");
        return true;
    }

}
