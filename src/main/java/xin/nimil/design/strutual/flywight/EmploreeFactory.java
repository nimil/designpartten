package xin.nimil.design.strutual.flywight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/1/21
 * @Time:20:56
 */
public class EmploreeFactory {

    private static final Map<String,Emplyee> EMPLYEE_MAP = new HashMap<>();

    public static Emplyee getManager(String department){
        Manager manager = (Manager)EMPLYEE_MAP.get(department);

        if (Objects.isNull(manager)){
            manager = new Manager(department,"报告内容");
            System.out.println("创建部门经理："+department);
            EMPLYEE_MAP.put(department,manager);
        }

        return manager;
    }

}
