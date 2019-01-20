package xin.nimil.design.strutual.adaptor.objectadaptor;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:21:16
 */
public class PowerAdaptor implements DC5{

    private AC220 ac220 = new AC220();

    @Override
    public int output5V() {
        System.out.println("使用adptor输出直流电"+ac220.outputAC220v()/44);
        return   ac220.outputAC220v()/44;
    }
}
