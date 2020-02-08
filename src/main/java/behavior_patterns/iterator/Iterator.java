package behavior_patterns.iterator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 15:06 2020/2/8
 * @Modified By:
 */
public interface Iterator {

    /**
     * 指针前移
     * @return 前一个对象
     */
    public Object previous();

    /**
     * 指针后移
     * @return 后一个对象
     */
    public Object next();

    public boolean hasNext();



}
