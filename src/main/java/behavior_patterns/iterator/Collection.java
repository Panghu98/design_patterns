package behavior_patterns.iterator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 15:05 2020/2/8
 * @Modified By:
 */
public interface Collection {
    /**
     * 对象集合的迭代
     * @return
     */
    public Iterator iterator();

    /**
     * 取得集合元素
     */
    public Object get(int i);

    /**
     * 向集合添加元素
     */
    public boolean add(Object object);

    /**
     * 取得集合大小
     */
    public int size();

}
