package behavior_patterns.mediator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 10:35 2020/2/9
 * @Modified By:
 */
public class ConcreteMediator extends Mediator {

    public ConcreteMediator(Colleague colleagueTenant, Colleague colleagueLandlord) {
        super(colleagueTenant, colleagueLandlord);
    }

    @Override
    public boolean notifyColleagueTenant(String message) {
        if (colleagueTenant != null) {
            return colleagueTenant.operation(message);
        }
        return false;
    }

    @Override
    public boolean notifyColleagueLandlord(String message) {
        if (colleagueLandlord != null) {
            return colleagueLandlord.operation(message);
        }
        return false;
    }
}
