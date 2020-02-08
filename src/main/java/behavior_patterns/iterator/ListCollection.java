package behavior_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 15:06 2020/2/8
 * @Modified By:
 */
public class ListCollection implements Collection {

    /**
     * 用于数据存储
     */
    public List<Object> list = new ArrayList<>();

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }

    @Override
    public boolean add(Object object) {
        return list.add(object);
    }

    @Override
    public int size() {
        return list.size();
    }
}
