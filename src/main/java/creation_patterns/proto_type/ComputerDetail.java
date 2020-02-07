package creation_patterns.proto_type;

/**
 * @author: panghu
 * @Description: 原型模式深克隆实现
 * @Date: Created in 22:55 2020/2/4
 * @Modified By:
 */
public class ComputerDetail implements Cloneable {

    private String cpu;

    private String memory;

    private Disk disk;

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

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public ComputerDetail(String cpu, String memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    /**
     * 深复制实现
     * @return
     */
    @Override
    public Object clone() {
        try{
            ComputerDetail computerDetail = (ComputerDetail)super.clone();
            computerDetail.disk =(Disk) this.disk.clone();
            return computerDetail;
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
