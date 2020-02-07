package creation_patterns.factory.abstract_factory;

/**
 * @author: panghu
 * @Description: Summer皮肤工厂：具体工厂
 * @Date: Created in 21:20 2020/2/4
 * @Modified By:
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}