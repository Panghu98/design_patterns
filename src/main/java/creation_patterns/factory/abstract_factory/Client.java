package creation_patterns.factory.abstract_factory;

/**
 * @author: panghu
 * @Description: 抽象工厂模式测试方法
 * @Date: Created in 21:28 2020/2/4
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory)XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }

}
