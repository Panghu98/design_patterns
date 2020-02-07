package structure_patterns.decorator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 16:09 2020/2/6
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.createComputer();
    }

}
