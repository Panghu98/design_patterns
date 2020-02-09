package behavior_patterns.mediator;

/**
 * @author: panghu
 * @Description: 房东
 * @Date: Created in 10:31 2020/2/9
 * @Modified By:
 */
public class ColleagueLandlord extends Colleague{

    /**
     * 收到房客的需求
     * @param message
     * @return
     */
    @Override
    public boolean operation(String message) {
        System.out.println("landlord receive a message from mediator +:" + message);
        return true;
    }


}
