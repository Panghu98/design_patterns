package behavior_patterns.iterator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 17:22 2020/2/8
 * @Modified By:
 */
public class ConcreteIterator implements Iterator {

    private Collection collection;

    /**
     * 当前迭代器遍历到的位置
     */
    private int pos = -1;

    public ConcreteIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {

        if (pos < collection.size() -1) {
            pos ++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        return pos<(collection.size() -1);
    }
}
