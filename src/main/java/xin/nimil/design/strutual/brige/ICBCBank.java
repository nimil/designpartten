package xin.nimil.design.strutual.brige;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/26
 * @Time:10:44
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        return account;
    }

    @Override
    void showAccount() {
        System.out.println("查看中国农业银行账号");
    }
}
