package xin.nimil.design.creational.singleton;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/13
 * @Time:20:11
 */
@Getter
public enum EnumInstance {
    INSTANCE;

    private Object data;

    public Object getData(){
        return this.data;
    }

    public void setData(Object object){
        this.data = data;
    }


    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
