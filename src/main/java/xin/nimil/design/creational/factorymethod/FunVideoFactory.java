package xin.nimil.design.creational.factorymethod;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/2
 * @Time:22:03
 */
public class FunVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FunVideo();
    }
}
