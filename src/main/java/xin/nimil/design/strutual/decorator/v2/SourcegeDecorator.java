package xin.nimil.design.strutual.decorator.v2;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:14:37
 */
public class SourcegeDecorator extends AbstractDecorator {
    public SourcegeDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"  加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
