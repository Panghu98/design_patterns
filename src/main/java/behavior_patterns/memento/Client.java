package behavior_patterns.memento;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 22:50 2020/2/8
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //创建原始类
        Original original = new Original("张三");

        //创建备忘录
        Storage storage = new Storage(original.createMemento());

        //修改原始类的状态
        System.out.println("original value" + original.getValue());
        original.setValue("李四");
        System.out.println("update value" + original.getValue());

        //恢复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("restore value " + original.getValue());
    }

}
