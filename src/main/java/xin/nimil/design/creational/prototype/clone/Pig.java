package xin.nimil.design.creational.prototype.clone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/14
 * @Time:21:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pig implements Cloneable{

    private String name;

    private Date birthday;

    @Override
    /**
     * 默认是潜克隆
     */
    protected Object clone() throws CloneNotSupportedException {
        //深克隆 实现 拷贝对象中的对象方法
        Pig pig = (Pig) super.clone();
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
