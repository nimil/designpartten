package xin.nimil.design.interfacesegragetion;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:14:55
 */
public class Bird implements IAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        //只能是空实现放在这里，接口可以细化
    }
}
