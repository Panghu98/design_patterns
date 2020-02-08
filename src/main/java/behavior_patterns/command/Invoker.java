package behavior_patterns.command;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 22:20 2020/2/8
 * @Modified By:
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(String commandMessage) {
        System.out.println("command sending....");
        command.execute(commandMessage);
    }


}
