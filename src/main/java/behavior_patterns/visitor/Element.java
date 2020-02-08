package behavior_patterns.visitor;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:40 2020/2/8
 * @Modified By:
 */
public interface Element {

    void accept(Visitor visitor);

}
