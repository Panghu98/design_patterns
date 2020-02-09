package behavior_patterns.interpreter;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 11:09 2020/2/9
 * @Modified By:
 */
public interface Expression {

    /**
     * 解释方法
     */
    public void interpret(Context context);

}
