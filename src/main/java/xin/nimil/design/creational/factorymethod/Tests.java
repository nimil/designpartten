package xin.nimil.design.creational.factorymethod;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:21:02
 */
public class Tests {
    public static void main(String[] args) {
        VideoFactory videoFactory = new ActionVideoFactory();
        videoFactory.getVideo().produce();
    }

}
