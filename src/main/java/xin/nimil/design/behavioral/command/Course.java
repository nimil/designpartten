package xin.nimil.design.behavioral.command;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/25
 * @Time:21:15
 */
public class Course {
    private String name;

    public Course(String name){
        this.name = name;
    }

    public void open(){
        System.out.println(this.name+"课程开放");
    }

    public void close(){
        System.out.println(this.name+"课程关闭");
    }

}
