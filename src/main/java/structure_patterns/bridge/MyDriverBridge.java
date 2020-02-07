package structure_patterns.bridge;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 20:26 2020/2/7
 * @Modified By:
 */
public class MyDriverBridge extends DriverManagerBridge {

    @Override
    public void execute() {
        getDriver().executeSQL();
    }

}
