package structure_patterns.decorator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 16:05 2020/2/6
 * @Modified By:
 */
public class Source implements Sourceable {
    @Override
    public void createComputer() {
        System.out.println("create computer by Source...");
    }
}
