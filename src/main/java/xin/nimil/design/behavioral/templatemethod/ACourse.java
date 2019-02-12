package xin.nimil.design.behavioral.templatemethod;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/12
 * @Time:21:04
 */
public abstract class ACourse {

    protected final void makecourse(){
        this.makePPT();
        this.makeVIDEO();
        this.packageCourse();
        if (this.needWirteArtical()){
            writeArtical();
        }
    }

    final void makePPT(){
        System.out.println("制作ppt");
    }

    final void makeVIDEO(){
        System.out.println("制作视频");
    }

    final void writeArtical(){
        System.out.println("写文章");
    }

    //钩子方法
    protected boolean needWirteArtical(){
        return false;
    }

    abstract void packageCourse();
}
