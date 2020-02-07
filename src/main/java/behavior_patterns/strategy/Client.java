package behavior_patterns.strategy;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:02 2020/2/7
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        TravelStrategy travelByAirStrategy = new TravelByAirStrategy();
        //设置出行策略为飞机
        context.setTravelStrategy(travelByAirStrategy);
        context.travelMode();
        System.out.println("change travel strategy to travelByCarStrategy");

        //设置出行策略为开车自驾
        TravelStrategy travelByCarStrategy = new TravelByAirStrategy();
        context.setTravelStrategy(travelByCarStrategy);
        context.travelMode();
    }

}
