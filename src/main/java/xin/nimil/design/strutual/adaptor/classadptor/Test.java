package xin.nimil.design.strutual.adaptor.classadptor;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:21:08
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcurrentTarget();
        target.request();
        Target ad = new Adapter();
        ad.request();
    }
}
