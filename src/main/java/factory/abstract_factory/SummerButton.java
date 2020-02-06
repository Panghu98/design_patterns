package factory.abstract_factory;

/**
 * @author: panghu
 * @Description: Summer按钮类：具体产品
 * @Date: Created in 11:19 2020/2/3
 * @Modified By:
 */
public class SummerButton implements Button{

    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }

}
