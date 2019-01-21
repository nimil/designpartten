package xin.nimil.design.strutual.flywight;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/21
 * @Time:21:01
 */
public class Test {

    private static final String depart[] = {"QA","RD","PM"};

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            String depa = depart[(int)(Math.random() * depart.length)];
            Manager manager = (Manager) EmploreeFactory.getManager(depa);
            manager.report();
        }


    }
}
