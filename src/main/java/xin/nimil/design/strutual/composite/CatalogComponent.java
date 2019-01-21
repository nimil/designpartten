package xin.nimil.design.strutual.composite;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/21
 * @Time:21:30
 */
public abstract class CatalogComponent {

    void add(CatalogComponent catalogComponent){
        throw  new UnsupportedOperationException("不支持添加操作");
    }

    void remove(CatalogComponent catalogComponent){
        throw  new UnsupportedOperationException("不支持删除操作");
    }
    void getName(CatalogComponent catalogComponent){
        throw  new UnsupportedOperationException("不支持获取名称操作");
    }
    void print(CatalogComponent catalogComponent){
        throw  new UnsupportedOperationException("不支持打印操作");
    }

    abstract void print();
}
