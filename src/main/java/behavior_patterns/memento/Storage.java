package behavior_patterns.memento;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 22:49 2020/2/8
 * @Modified By:
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
