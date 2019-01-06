package xin.nimil.design.creational.abstractfactory;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/6
 * @Time:20:24
 */
public class ComdyMovie extends Movie {
    @Override
    public void produce() {
        System.out.println("this is comdy factory");
    }
}
