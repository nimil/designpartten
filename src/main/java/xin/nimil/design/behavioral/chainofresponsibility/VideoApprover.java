package xin.nimil.design.behavioral.chainofresponsibility;

import java.util.Objects;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/25
 * @Time:21:57
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (Objects.nonNull(course.getVideo())){
            System.out.println(course.getName()+"含有视频，批准");
            if (approver!=null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不包含视频，不批准");
            return;
        }
    }
}
