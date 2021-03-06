package xin.nimil.design.creational.factorymethod;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:21:03
 */
public abstract class VideoFactory {

    /**
     * 创建对象的video factory
     * @return
     */
    public abstract Video getVideo();

//    public static Video getVideo(String type){
//        if ("action".equals(type)){
//            return new ActionVideo();
//        }else if ("love".equals(type)){
//            return new LoveStroryVideo();
//        }else{
//            return null;
//        }
//    }

//    public static Video getVideo(Class z){
//        Video video = null;
//        try {
//            Object o = Class.forName(z.getName()).newInstance();
//            if (o instanceof Video){
//                video = (Video)o;
//            }
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }

}
