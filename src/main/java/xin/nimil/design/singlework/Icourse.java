package xin.nimil.design.singlework;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:14:18
 */
public interface Icourse {

    String getCouseName();
    byte[] getCourseVideo();

    void studyCourse();

    //可以拆分成两个接口作为单一职责使用  课程相关和钱相关
    void refundCourse();
}
