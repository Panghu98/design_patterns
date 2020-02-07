package creation_patterns.factory.abstract_factory;

/**
 * @author: panghu
 * @Description: Summer组合框类：具体产品
 * @Date: Created in 20:56 2020/2/4
 * @Modified By:
 */
public class SummerComboBox  implements ComboBox{

    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }

}
