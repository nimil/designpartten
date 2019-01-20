package xin.nimil.design.strutual.decorator.v2;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:14:34
 */
public class AbstractDecorator extends ABatterCake {

    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake){
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBatterCake.cost();
    }

}
