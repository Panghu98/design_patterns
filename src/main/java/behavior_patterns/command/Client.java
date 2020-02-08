package behavior_patterns.command;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 22:25 2020/2/8
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //定义命令接收者和执行者
        Receiver receiver = new Receiver();
        //定义命令实现类
        Command command = new ConcreteCommand(receiver);

        //定义命令调用者
        Invoker invoker = new Invoker(command);
        //命令调用
        invoker.action("command1");
    }

}
