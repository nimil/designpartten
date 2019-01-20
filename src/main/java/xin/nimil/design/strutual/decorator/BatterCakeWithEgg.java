package xin.nimil.design.strutual.decorator;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:14:24
 */
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getDesc() {
        return super.getDesc()+"加一个蛋";
    }

    @Override
    public int getCount() {
        return super.getCount()+2;
    }
}
