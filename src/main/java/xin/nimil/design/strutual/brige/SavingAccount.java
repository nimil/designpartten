package xin.nimil.design.strutual.brige;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/26
 * @Time:10:37
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {

        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {

        System.out.println("这是一个活期账号");
    }
}
