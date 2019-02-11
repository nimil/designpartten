package xin.nimil.design.strutual.brige;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/26
 * @Time:10:40
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account){
        this.account = account;
    }

    abstract Account openAccount();

    abstract void showAccount();



}
