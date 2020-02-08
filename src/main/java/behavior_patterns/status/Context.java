package behavior_patterns.status;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:16 2020/2/8
 * @Modified By:
 */
public class Context {

    private AbstractState state;

    public Context(AbstractState state) {
        this.state = state;
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void action() {
        state.action(this);
    }

}
