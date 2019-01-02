package xin.nimil.design.creational.factorymethod;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/2
 * @Time:21:59
 */
public class ActionVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new ActionVideo();
    }
}
