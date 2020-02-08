package behavior_patterns.iterator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 17:28 2020/2/8
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //定义集合
        Collection collection = new ListCollection();
        //向集合中添加元素
        collection.add("object1");
        //使用迭代器遍历集合
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
