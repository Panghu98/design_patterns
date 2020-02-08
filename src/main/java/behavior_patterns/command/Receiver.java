package behavior_patterns.command;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 22:18 2020/2/8
 * @Modified By:
 */
public class Receiver {

    /**
     * 接受并执行命令
     */
    public void action(String command) {
        System.out.println("command received ,now execute command....");
    }

}
