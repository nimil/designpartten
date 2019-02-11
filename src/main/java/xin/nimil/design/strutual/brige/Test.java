package xin.nimil.design.strutual.brige;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/26
 * @Time:10:49
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcbank = new ICBCBank(new DepositAccount());
        Account account = icbcbank.openAccount();
        account.showAccountType();

        Bank abcbank = new ABCBank(new SavingAccount());
        Account account1 = abcbank.openAccount();
        account1.showAccountType();
    }
}
