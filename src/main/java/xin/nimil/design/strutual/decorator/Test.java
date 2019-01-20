package xin.nimil.design.strutual.decorator;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/20
 * @Time:14:26
 */
public class Test {
    public static void main(String[] args) {
        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc()+"售价是:"+batterCakeWithEggSausage.getCount());

    }
}
