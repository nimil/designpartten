package xin.nimil.design.gengreantion;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/1
 * @Time:20:40
 */
public class Production  {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }


    public void addProduct(){
        System.out.println(dbConnection.DBConnection()+"production");
    }

}
