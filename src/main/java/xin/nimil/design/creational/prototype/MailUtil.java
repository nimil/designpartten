package xin.nimil.design.creational.prototype;

import java.text.MessageFormat;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/14
 * @Time:21:33
 */
public class MailUtil {

    private MailUtil(){}

    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学,邮件地址{1},邮件内容：{2},发送邮件成功";
        System.err.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }

    public static void saveOriginMailRecore(Mail mail){
        System.err.println(mail);
    }


}
