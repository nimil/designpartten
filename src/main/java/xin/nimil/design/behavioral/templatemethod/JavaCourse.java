package xin.nimil.design.behavioral.templatemethod;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/12
 * @Time:21:08
 */
public class JavaCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("提供java源代码");
    }

    @Override
    protected boolean needWirteArtical() {
        return true;
    }
}
