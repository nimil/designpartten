package xin.nimil.design.creational.prototype;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/14
 * @Time:21:36
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();

        mail.setContent("初始化模板");
        MailUtil.saveOriginMailRecore(mail);

        for (int i = 0; i < 10; i++) {
            Mail mailtemp = (Mail) mail.clone();
            mailtemp.setName("姓名"+i);
            mailtemp.setEmailAddress("姓名"+i+"@qq.com");
            mailtemp.setContent("恭喜您，此次活动中奖了");
            MailUtil.sendMail(mail);
        }

    }

}
