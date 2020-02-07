package structure_patterns.adapter.class_adapter;

/**
 * @author: panghu
 * @Description: 测试类
 * @Date: Created in 11:00 2020/2/6
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.editTextFile();
        target.editWordFile();
    }

}
