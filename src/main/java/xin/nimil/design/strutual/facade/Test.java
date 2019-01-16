package xin.nimil.design.strutual.facade;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/16
 * @Time:21:06
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("lalal");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setQualifuService(new QualifuService());
        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.giftExchange(pointsGift);
    }
}
