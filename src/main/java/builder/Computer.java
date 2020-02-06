package builder;

/**
 * @author: panghu
 * @Description: 需要生产的产品Computer
 * @Date: Created in 23:47 2020/2/4
 * @Modified By:
 */
public class Computer {

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

    public Computer() {
    }
}
