package behavior_patterns.mediator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 10:45 2020/2/9
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //定义房客同事类
        Colleague colleagueTenant = new ColleagueTenant();

        //定义房东同事类
        Colleague colleagueLandlord = new ColleagueLandlord();

        //创建一个具体的中介者，这里可以理解为房屋中介
        Mediator mediator = new ConcreteMediator(colleagueTenant,colleagueLandlord);

        boolean result = mediator.notifyColleagueTenant("想租两室一厅吗？");

        if (result) {
            mediator.notifyColleagueLandlord("租客对面积满意、");
        }else {
            mediator.notifyColleagueLandlord("租客对面积不满意!!!");

        }
    }

}
