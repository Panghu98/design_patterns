package structure_patterns.flyweight;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 21:48 2020/2/7
 * @Modified By:
 */
public class Memory {

    /**
     * 内存大小，单位为MB
     */
    private int size;

    /**
     * 内存是否正在被使用
     */
    private boolean isused;

    /**
     * 内存id
     */
    private String id;

    public Memory(int size, boolean isused, String id) {
        this.size = size;
        this.isused = isused;
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isIsused() {
        return isused;
    }

    public void setIsused(boolean isused) {
        this.isused = isused;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
