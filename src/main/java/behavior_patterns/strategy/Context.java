package behavior_patterns.strategy;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:01 2020/2/7
 * @Modified By:
 */
public class Context {

    private TravelStrategy travelStrategy;

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travelMode() {
        this.travelStrategy.travelMode();
    }

}
