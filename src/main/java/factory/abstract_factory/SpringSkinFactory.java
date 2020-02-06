package factory.abstract_factory;

/**
 * @author: panghu
 * @Description: Spring皮肤工厂：具体工厂
 * @Date: Created in 21:00 2020/2/4
 * @Modified By:
 */
public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }


}
