package behavior_patterns.memento;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 22:41 2020/2/8
 * @Modified By:
 */
public class Original {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    /**
     * 创建备忘录
     * @return
     */
    public Memento createMemento() {
        return new Memento(value);
    }

    /**
     * 恢复数据
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }
}
