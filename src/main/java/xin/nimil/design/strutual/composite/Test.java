package xin.nimil.design.strutual.composite;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/21
 * @Time:21:40
 */
public class Test {

    public static void main(String[] args) {

        CatalogComponent catalogComponent = new Course("chinese");
        CatalogComponent catalogComponent1 = new Course("english");
        CatalogComponent catalogComponent2 = new Course("math");

        CatalogComponent catalogComponent3 = new CourseCatelog("xiaoxue");

        catalogComponent3.add(catalogComponent);
        catalogComponent3.add(catalogComponent1);
        catalogComponent3.add(catalogComponent2);

        catalogComponent.print();

        catalogComponent3.print();

        //不支持的操作，会抛出异常
        catalogComponent.add(catalogComponent1);
    }

}
