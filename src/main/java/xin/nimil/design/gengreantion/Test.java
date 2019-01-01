package xin.nimil.design.gengreantion;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:20:41
 */
public class Test {

    public static void main(String[] args) {
        Production production = new Production();
        production.setDbConnection(new MySQLConnection());
        production.setDbConnection(new OracleDbConnection());
        production.addProduct();
    }
}
