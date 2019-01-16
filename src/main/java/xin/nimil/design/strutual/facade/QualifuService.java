package xin.nimil.design.strutual.facade;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/16
 * @Time:20:57
 */
public class QualifuService {

    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+"积分资格通过，库存通过");
        return true;
    }

}
