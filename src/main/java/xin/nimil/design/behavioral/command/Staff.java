package xin.nimil.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/2/25
 * @Time:21:23
 */
public class Staff {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
         commands.add(command);
    }

    public void execute(){
        commands.forEach(Command::execute);
    }

}
