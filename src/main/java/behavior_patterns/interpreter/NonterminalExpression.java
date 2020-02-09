package behavior_patterns.interpreter;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 11:16 2020/2/9
 * @Modified By:
 */
public class NonterminalExpression implements Expression {

    private Expression left;
    private Expression right;

    public NonterminalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context context) {
        //递归调用每一个组成部分的interpret（）
        //在递归调用时指定组成部分的连接方式，及非终结符的功能
    }
}
