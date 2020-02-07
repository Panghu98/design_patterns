package structure_patterns.adapter.class_adapter;

/**
 * @author: panghu
 * @Description: 类适配器核心代码
 * @Date: Created in 10:56 2020/2/6
 * @Modified By:
 */
public class Adapter extends Source implements Targetable {

    //Adapter同时继承Source类和Targetable接口，Source类存在editTextFile方法，所以Adapter类中不需要在重写

    /**
     * 修改Word方法
     */
    @Override
    public void editWordFile() {
        System.out.println("a word file editing....");
    }
}
