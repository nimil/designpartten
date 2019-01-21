package xin.nimil.design.strutual.flywight;

import lombok.AllArgsConstructor;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/21
 * @Time:20:55
 */
@AllArgsConstructor
public class Manager implements Emplyee{
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String department;

    private String reportContent;

}
