package xin.nimil.design.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:15:05
 */
public class TeamLeader {

    public void checkNumberOfCourse(){
        List<Course> courses = new ArrayList<>();
        for (int i = 0;i<20;i++){
            courses.add(new Course());
        }
        System.out.println(courses.size());
    }

}
