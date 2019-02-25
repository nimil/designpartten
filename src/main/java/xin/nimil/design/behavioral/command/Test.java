package xin.nimil.design.behavioral.command;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/25
 * @Time:21:25
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("数学");
        OpenCourse openCourse = new OpenCourse(course);
        CloseCourse closeCourse  = new CloseCourse(course);
        Staff staff =new Staff();
        staff.addCommand(openCourse);
        staff.addCommand(closeCourse);
        staff.execute();
    }

}
