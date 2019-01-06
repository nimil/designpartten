package xin.nimil.design.creational.abstractfactory;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/6
 * @Time:20:33
 */
public class Test {
    public static void main(String[] args) {
        MovieFactory movieFactory = new ActionMovieStarFactory();
        movieFactory.getMovie().produce();
        movieFactory.getStar().produce();
    }
}
