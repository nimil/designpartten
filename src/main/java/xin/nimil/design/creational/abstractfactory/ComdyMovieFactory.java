package xin.nimil.design.creational.abstractfactory;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/6
 * @Time:20:27
 */
public class ComdyMovieFactory implements MovieFactory {
    @Override
    public Movie getMovie() {
        return new ComdyMovie();
    }

    @Override
    public Star getStar() {
        return new ComdyStart();
    }
}
