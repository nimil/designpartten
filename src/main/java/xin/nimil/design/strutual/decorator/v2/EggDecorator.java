package xin.nimil.design.strutual.decorator.v2;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:14:36
 */
public class EggDecorator extends AbstractDecorator{

    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"  加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
