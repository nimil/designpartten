package xin.nimil.design.behavioral.chainofresponsibility;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/25
 * @Time:22:00
 */
public class Test {
    public static void main(String[] args) {
        Approver aapprover = new ArticalApprover();
        Approver vapprover = new VideoApprover();
        Course course = new Course();
        course.setName("语文");
        course.setVideo("视频");
        course.setArtical("笔记");

        aapprover.setNextApprover(vapprover);
        aapprover.deploy(course);
    }
}
