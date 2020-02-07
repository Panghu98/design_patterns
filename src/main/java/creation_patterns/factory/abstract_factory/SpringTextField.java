package creation_patterns.factory.abstract_factory;

/**
 * @author: panghu
 * @Description: Spring文本框类：具体产品
 * @Date: Created in 11:29 2020/2/3
 * @Modified By:
 */
public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }

}
