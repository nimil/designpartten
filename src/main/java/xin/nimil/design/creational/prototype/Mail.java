package xin.nimil.design.creational.prototype;

import lombok.Data;
import lombok.ToString;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/14
 * @Time:21:31
 */
@Data
@ToString
public class Mail implements Cloneable{

    private String name;

    private String emailAddress;

    private String content;

    //克隆的时候不调用类的相应构造器
    public  Mail(){
        System.err.println("construct");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.err.println("clone mail object");
        return super.clone();
    }
}
