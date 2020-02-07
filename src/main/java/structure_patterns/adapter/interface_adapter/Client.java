package structure_patterns.adapter.interface_adapter;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 11:18 2020/2/6
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();
        source1.editTextFile();
        source2.editWordFile();
    }

}
