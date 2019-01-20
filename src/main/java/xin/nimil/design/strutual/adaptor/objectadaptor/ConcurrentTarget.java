package xin.nimil.design.strutual.adaptor.objectadaptor;


/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:21:06
 */
public class ConcurrentTarget implements Target {

    @Override
    public void request() {
        System.out.println("适配者");
    }
}
