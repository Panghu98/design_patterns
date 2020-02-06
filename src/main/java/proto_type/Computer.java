package proto_type;

/**
 * @author: panghu
 * @Description:  原型模式的浅复制实现
 * @Date: Created in 22:45 2020/2/4
 * @Modified By:
 */
public class Computer implements Cloneable {

    private String cpu;

    private String memory;

    private String disk;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    /**
     * 浅克隆
     * @return
     */
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
