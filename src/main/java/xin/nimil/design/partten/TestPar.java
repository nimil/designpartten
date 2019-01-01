package xin.nimil.design.partten;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:13:06
 */
public class TestPar {

    public static void main(String[] args) {
        IclazzImpl iclazz = new JavaIclazz(11.2,"dsd",222,213.2);

        double originPrice = ((JavaIclazz) iclazz).getOriginPrice();

        System.out.println(iclazz.getDiscount()+iclazz.getId()+"   "+iclazz.getPrice()+"  "+iclazz.getName()+"原价是:"+originPrice);
    }



}
