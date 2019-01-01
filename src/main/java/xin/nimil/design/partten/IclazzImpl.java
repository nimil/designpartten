package xin.nimil.design.partten;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:13:01
 */
public class IclazzImpl implements IClass {
    private double id;
    private String name;
    private double price;
    private double discount;

    IclazzImpl(double id,String name,double price,double discount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public Double getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public Double getDiscount() {
        return this.discount;
    }
}
