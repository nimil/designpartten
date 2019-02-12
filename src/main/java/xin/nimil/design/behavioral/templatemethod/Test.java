package xin.nimil.design.behavioral.templatemethod;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/12
 * @Time:21:10
 */
public class Test {
    public static void main(String[] args) {
        ACourse aCourse = new Fecourse();
        aCourse.makecourse();
        System.out.println();
        ACourse aCourse1 = new JavaCourse();
        aCourse1.makecourse();
    }

}
