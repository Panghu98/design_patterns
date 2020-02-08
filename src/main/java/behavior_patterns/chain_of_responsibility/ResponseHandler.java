package behavior_patterns.chain_of_responsibility;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 21:55 2020/2/8
 * @Modified By:
 */
public class ResponseHandler extends AbstractHandler implements Handler {

    private String name;

    public ResponseHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("message response....");
        if (getHandler() != null) {
            //执行职责链的下一个流程
            getHandler().operator();
        }
    }
}
