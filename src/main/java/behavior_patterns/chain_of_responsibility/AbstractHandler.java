package behavior_patterns.chain_of_responsibility;

/**
 * @author: panghu
 * @Description: 抽象类，用于将责任链上的各个组件连接起来，具体操作是
 *              通过setHandler()设置下一个环节组件，通过getHandler()获取下一个环节组件
 * @Date: Created in 21:51 2020/2/8
 * @Modified By:
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
