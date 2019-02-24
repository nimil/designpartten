package xin.nimil.design.behavioral.observer;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/24
 * @Time:16:20
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("TEst course");
        Teacher teacher = new Teacher("testtec");
        course.addObserver(teacher);
        Question question = new Question();
        question.setQuestionName("testqa");
        question.setUserName("nimil");
        course.produceQuestion(course,question);
    }
}
