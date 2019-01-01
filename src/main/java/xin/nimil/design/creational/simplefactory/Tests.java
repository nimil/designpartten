package xin.nimil.design.creational.simplefactory;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:21:02
 */
public class Tests {
    public static void main(String[] args) {
        //Video video = new ActionVideo();
        //video.produce();
       // VideoFactory.getVideo("action").produce();
        VideoFactory.getVideo(ActionVideo.class).produce();
    }

}
