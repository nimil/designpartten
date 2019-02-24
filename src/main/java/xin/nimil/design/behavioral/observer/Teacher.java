package xin.nimil.design.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/24
 * @Time:16:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Observer {

    private String techerName;

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question)arg;
        System.out.println(techerName+course.getCourseName()+"课程接收到一个"+question.getUserName()+"提交的一个问题"+question.getQuestionName());
    }
}
