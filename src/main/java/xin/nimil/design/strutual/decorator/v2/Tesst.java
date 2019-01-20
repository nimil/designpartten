package xin.nimil.design.strutual.decorator.v2;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:14:40
 */
public class Tesst {

    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SourcegeDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc()+"  售价是："+aBatterCake.cost());
    }

}
