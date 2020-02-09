package behavior_patterns.mediator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 10:29 2020/2/9
 * @Modified By:
 */
public abstract class Mediator {

    /**
     * 房客
     */
    protected Colleague colleagueTenant;

    /**
     * 房东
     */
    protected Colleague colleagueLandlord;

    public Mediator(Colleague colleagueTenant, Colleague colleagueLandlord) {
        this.colleagueTenant = colleagueTenant;
        this.colleagueLandlord = colleagueLandlord;
    }

    public abstract boolean notifyColleagueTenant(String message);

    public abstract boolean notifyColleagueLandlord(String message);

}
