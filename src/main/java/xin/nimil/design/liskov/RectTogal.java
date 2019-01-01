package xin.nimil.design.liskov;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:16:41
 */
public class RectTogal implements QuarTogal{

    private long length;

    private long width;

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return width;
    }



    public void setWidth(long width) {
        this.width = width;
    }
}
