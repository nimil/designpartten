package xin.nimil.design.behavioral.command;

import lombok.AllArgsConstructor;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/25
 * @Time:21:19
 */
@AllArgsConstructor
public class OpenCourse implements Command {

    private Course course;

    @Override
    public void execute() {
        course.open();
    }
}
