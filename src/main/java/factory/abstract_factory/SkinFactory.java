package factory.abstract_factory;

/**
 * @author: panghu
 * @Description: 界面皮肤接口：抽象工厂
 * @Date: Created in 20:58 2020/2/4
 * @Modified By:
 */
public interface SkinFactory {

    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();

}
