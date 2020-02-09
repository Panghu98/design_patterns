package behavior_patterns.mediator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 10:29 2020/2/9
 * @Modified By:
 */
public abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 同事类的操作
     * @param message
     * @return
     */
    public abstract boolean operation(String message);

}
