package xin.nimil.design.behavioral.chainofresponsibility;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/25
 * @Time:21:52
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
