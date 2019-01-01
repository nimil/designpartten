package xin.nimil.design.liskov;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:16:45
 */
public class Test {


    public static void resize(RectTogal rectTogal){
        while(rectTogal.getWidth()<rectTogal.getLength()){
            rectTogal.setWidth(rectTogal.getWidth()+1);
            System.out.println("width:"+rectTogal.getWidth()+"  length:"+rectTogal.getLength());
        }
        System.out.println("resize 方法结束 width:"+rectTogal.getWidth());
    }

    /**
     * 换成正方形不符合规范
     * 可以将长方形换成同样继承同一个父类
     * @param args
     */
    public static void main(String[] args) {
        RectTogal rectTogal = new RectTogal();
        rectTogal.setWidth(10);
        rectTogal.setLength(21);

        resize(rectTogal);
    }

}
