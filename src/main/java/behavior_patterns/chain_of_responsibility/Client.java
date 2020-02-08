package behavior_patterns.chain_of_responsibility;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 21:59 2020/2/8
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        AuthHandler authHandler = new AuthHandler("auth");
        BusinessHandler businessHandler = new BusinessHandler("business");
        ResponseHandler responseHandler = new ResponseHandler("response");

        authHandler.setHandler(businessHandler);
        businessHandler.setHandler(responseHandler);
        authHandler.operator();
    }

}
