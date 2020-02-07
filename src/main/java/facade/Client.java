package facade;

/**
 * @author: panghu
 * @Description: 客户端类
 * @Date: Created in 18:25 2020/2/7
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Starter starter = new Starter();
        starter.startup();
        System.out.println("=================================");
        starter.shutdown();
    }

}
