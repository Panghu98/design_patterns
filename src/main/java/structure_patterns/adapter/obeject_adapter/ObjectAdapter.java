package structure_patterns.adapter.obeject_adapter;

/**
 * @author: panghu
 * @Description: 对象适配器关键类
 * @Date: Created in 11:08 2020/2/6
 * @Modified By:
 */
public class ObjectAdapter implements  Targetable {

    private Source source;

    public ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    /**
     * 通过调用source中的editTextFile类实现接口中的方法
     */
    @Override
    public void editTextFile() {
        this.source.editTextFile();
    }

    @Override
    public void editWordFile() {
        System.out.println("a word file editing....");
    }
}
