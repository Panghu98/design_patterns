package structure_patterns.bridge;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 20:22 2020/2/7
 * @Modified By:
 */
public class MysqlDriver implements Driver {

    @Override
    public void executeSQL() {
        System.out.println("execute SQL by MySQL driver...");
    }
}
