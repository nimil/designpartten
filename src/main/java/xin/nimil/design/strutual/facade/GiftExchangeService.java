package xin.nimil.design.strutual.facade;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/16
 * @Time:21:03
 */
@Setter
public class GiftExchangeService {

    private QualifuService qualifuService;

    private PointsPaymentService pointsPaymentService;

    private ShippingService shippingService;


    public void giftExchange(PointsGift pointsGift){
        if (qualifuService.isAvailable(pointsGift)){
            //资格校验
            if (pointsPaymentService.pay(pointsGift)){
                String order = shippingService.shipGift(pointsGift);
                System.out.println("下单成功");
            }
        }

    }
}
