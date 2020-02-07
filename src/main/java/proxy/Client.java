package proxy;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:22 2020/2/6
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Company company = new Proxy();
        company.findWorkers("java");
    }

}
