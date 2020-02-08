package behavior_patterns.status;


/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:13 2020/2/8
 * @Modified By:
 */
public class HolidayState extends AbstractState {

    @Override
    public void action(Context context) {
        System.out.println("state change to holiday state ");
        System.out.println("holiday state action is travel,shopping,watch television..");
    }
}
