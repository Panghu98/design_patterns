package behavior_patterns.memento;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 22:43 2020/2/8
 * @Modified By:
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
