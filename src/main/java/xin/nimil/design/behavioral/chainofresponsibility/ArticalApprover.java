package xin.nimil.design.behavioral.chainofresponsibility;

import java.util.Objects;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/25
 * @Time:21:54
 */
public class ArticalApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (Objects.nonNull(course.getArtical())){
            System.out.println(course.getName()+"含有手记，批准");
            if (approver!=null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不包含手记，不批准");
            return;
        }
    }
}
