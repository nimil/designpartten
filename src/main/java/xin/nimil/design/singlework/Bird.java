package xin.nimil.design.singlework;

import java.util.Objects;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:14:10
 */
public class Bird {
    public void mainMoveMode(String bindName){
        if(Objects.equals("鸵鸟",bindName)){
            System.out.println(bindName+"用脚走");
        }else{
        System.out.println(bindName+"用翅膀飞");
        }
    }

}
