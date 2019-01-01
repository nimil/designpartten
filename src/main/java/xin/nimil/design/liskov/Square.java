package xin.nimil.design.liskov;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:16:42
 */
public class Square implements QuarTogal{

    @Override
    public long getLength() {
        return this.sideLength;
    }



    @Override
    public long getWidth() {
        return this.sideLength;
    }



    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
