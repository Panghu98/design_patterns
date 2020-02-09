package behavior_patterns.mediator;

/**
 * @author: panghu
 * @Description: 房东
 * @Date: Created in 10:31 2020/2/9
 * @Modified By:
 */
public class ColleagueTenant extends Colleague{

    /**
     * 收到房东的需求
     * @param message
     * @return
     */
    @Override
    public boolean operation(String message) {
        System.out.println("tenant receive a message from mediator +:" + message);
        return true;
    }


}
