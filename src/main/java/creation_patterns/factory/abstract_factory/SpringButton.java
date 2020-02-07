package creation_patterns.factory.abstract_factory;

/**
 * @author: panghu
 * @Description: Spring按钮类：具体产品
 * @Date: Created in 11:18 2020/2/3
 * @Modified By:
 */
public class SpringButton implements Button{

    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }

}
