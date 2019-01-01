package xin.nimil.design.dependenceinversion;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:13:21
 */
public class Lilly {

    private Icouse icouse;

    public void studyJava(){
        System.out.println("lilly java");
    }

    public void studyFront(){
        System.out.println("lilly front");
    }

    public void setIcouse(Icouse icouse){
        this.icouse = icouse;
    }

    public void studyClass(){
        icouse.stydyCourse();
    }


    public  void studyClazz(Icouse icouse){
        icouse.stydyCourse();
    }
}
