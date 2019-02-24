package xin.nimil.design.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/24
 * @Time:16:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course extends Observable {

    private String courseName;

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }


}
