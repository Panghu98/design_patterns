package behavior_patterns.status;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:17 2020/2/8
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //定义当前状态为工作状态
        Context context = new Context(new WorkState());
        context.action();

        //切换当前状态为休假状态
        context.setState(new HolidayState());
        context.action();
    }

}
