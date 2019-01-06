package xin.nimil.design.creational.abstractfactory;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/6
 * @Time:20:20
 */
public class ActionMovieStarFactory implements MovieFactory {
    @Override
    public Movie getMovie() {
        return new ActionMovie();
    }

    @Override
    public Star getStar() {
        return new ActionStar();
    }
}
