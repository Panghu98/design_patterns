package behavior_patterns.command;

/**
 * @author: panghu
 * @Description: 该类持有命令接受和执行者Receiver的实例，并实现了Command接口中的
 *                  execute（）方法，具体操作是在ConcreteCommand接收到命令之后，调用Receiver的action
 *                  命令交给Receiver执行
 * @Date: Created in 22:16 2020/2/8
 * @Modified By:
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String command) {
        receiver.action(command);
    }
}
