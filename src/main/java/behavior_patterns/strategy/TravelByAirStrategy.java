package behavior_patterns.strategy;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:00 2020/2/7
 * @Modified By:
 */
public class TravelByAirStrategy implements TravelStrategy {
    @Override
    public void travelMode() {
        System.out.println("travel by air..");
    }
}
