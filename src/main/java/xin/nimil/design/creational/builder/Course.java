package xin.nimil.design.creational.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/12
 * @Time:15:22
 */
@Data
@Builder
public class Course {
    private String name;

    private String ppt;

    private String video;

    private String article;

    private String qa;

}
