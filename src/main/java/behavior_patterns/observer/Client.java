package behavior_patterns.observer;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 14:54 2020/2/8
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.add(observer);

        subject.notifyObserver("data1");
    }

}
