package behavior_patterns.observer;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 14:52 2020/2/8
 * @Modified By:
 */
public class ConcreteObserver implements Observer {
    @Override
    public void changeData(String message) {
        System.out.println("receive message:" + message);
    }
}
