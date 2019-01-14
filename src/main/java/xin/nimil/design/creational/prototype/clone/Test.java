package xin.nimil.design.creational.prototype.clone;

import java.util.Date;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/14
 * @Time:21:50
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date(0L);
        Pig pig1 = new Pig("佩琪",date);

        Pig pig2 = (Pig) pig1.clone();


        pig1.getBirthday().setTime(666666666666666L);
        //两个对象都被改变了
        System.out.println(pig1);
        System.out.println(pig2);
    }



}
