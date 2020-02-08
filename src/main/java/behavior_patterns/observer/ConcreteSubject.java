package behavior_patterns.observer;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 14:54 2020/2/8
 * @Modified By:
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observerList) {
            System.out.println("notify observer " + message + "change ...");
            observer.changeData(message);
        }
    }
}
