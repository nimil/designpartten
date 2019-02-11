package xin.nimil.design.strutual.brige;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/26
 * @Time:10:43
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        return account;
    }

    @Override
    void showAccount() {
        System.out.println("查看中国农业银行账号");
    }
}
