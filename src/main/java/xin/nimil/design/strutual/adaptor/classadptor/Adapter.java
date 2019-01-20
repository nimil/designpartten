package xin.nimil.design.strutual.adaptor.classadptor;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:21:06
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
