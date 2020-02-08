package behavior_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 14:15 2020/2/8
 * @Modified By:
 */
public abstract class Subject {

    protected List<Observer> observerList = new ArrayList<>();

    /**
     * 增加观察者
     */
    public void add(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者
     */
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知观察者方法
     * @param message
     */
    public abstract void notifyObserver(String message);

}
