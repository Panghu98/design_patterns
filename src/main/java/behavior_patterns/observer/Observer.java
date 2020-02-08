package behavior_patterns.observer;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 14:49 2020/2/8
 * @Modified By:
 */
public interface Observer {

    /**
     * 接收数据
     * @param message
     */
    void changeData(String message);

}
