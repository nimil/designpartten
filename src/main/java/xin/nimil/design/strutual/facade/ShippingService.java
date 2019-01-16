package xin.nimil.design.strutual.facade;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/16
 * @Time:21:00
 */
public class ShippingService {

    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shopingOrderNo = "666";
        return shopingOrderNo;
    }

}
