package xin.nimil.design.strutual.decorator;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:14:25
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {


    @Override
    public String getDesc() {
        return super.getDesc()+"烤肠";
    }

    @Override
    public int getCount() {
        return super.getCount()+2;
    }
}
