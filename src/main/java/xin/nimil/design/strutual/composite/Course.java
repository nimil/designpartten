package xin.nimil.design.strutual.composite;

import lombok.AllArgsConstructor;
import sun.dc.pr.PRError;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/21
 * @Time:21:33
 */
@AllArgsConstructor
public class Course extends CatalogComponent {

    private String name;

    @Override
    void getName(CatalogComponent catalogComponent) {
        System.out.println(this.name);
    }

    @Override
    void print() {
        System.out.println(this.name);
    }
}
