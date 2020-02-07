package structure_patterns.adapter.interface_adapter;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 11:17 2020/2/6
 * @Modified By:
 */
public class SourceSub2 extends AbstractAdapter {

    @Override
    public void editWordFile() {
        System.out.println("a word file editing...");
    }
}
