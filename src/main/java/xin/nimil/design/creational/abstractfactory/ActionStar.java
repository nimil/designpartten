package xin.nimil.design.creational.abstractfactory;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/6
 * @Time:20:25
 */
public class ActionStar extends Star {
    @Override
    public void produce() {
        System.out.println("this is action start method");
    }
}
