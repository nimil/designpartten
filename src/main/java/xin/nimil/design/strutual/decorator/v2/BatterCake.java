package xin.nimil.design.strutual.decorator.v2;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:14:33
 */
public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
