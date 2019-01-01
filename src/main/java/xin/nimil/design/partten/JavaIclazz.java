package xin.nimil.design.partten;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:13:11
 */
public class JavaIclazz extends IclazzImpl {
    JavaIclazz(double id, String name, double price, double discount) {
        super(id, name, price, discount);
    }

    @Override
    public Double getPrice(){
        return super.getPrice()*0.8;
    }

    public double getOriginPrice(){
        return super.getPrice();
    }
}
