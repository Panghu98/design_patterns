package structure_patterns.bridge;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 20:24 2020/2/7
 * @Modified By:
 */
public abstract class DriverManagerBridge {

    private Driver driver;

    public void execute() {
        this.driver.executeSQL();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
