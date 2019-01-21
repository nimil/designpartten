package xin.nimil.design.strutual.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/21
 * @Time:21:35
 */
public class CourseCatelog extends CatalogComponent {

    private List<CatalogComponent> items = new ArrayList<>();

    private String name;

    public CourseCatelog(String name){
        this.name = name;
    }

    @Override
    void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    void print(){
        for (CatalogComponent catalogComponent:items){
            catalogComponent.print();
        }
    }
}
