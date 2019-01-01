package xin.nimil.design.dependenceinversion;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:13:23
 */
public class Testss {
    public static void main(String[] args) {
        Lilly lilly = new Lilly();
        lilly.studyFront();
        lilly.studyJava();

        Lilly lilly1 = new Lilly();
        lilly1.studyClazz(new JavaCouse());
        lilly1.studyClazz(new FeCourse());
        lilly1.studyClazz(new PythonCouse());

        Lilly lilly2 = new Lilly();
        lilly2.setIcouse(new JavaCouse());
        lilly2.studyClass();
        lilly2.setIcouse(new PythonCouse());
        lilly2.studyClass();

    }
}
