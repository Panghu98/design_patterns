package creation_patterns.proto_type;

/**
 * @author: panghu
 * @Description: 引用对象深复制
 * @Date: Created in 23:03 2020/2/4
 * @Modified By:
 */
public class Disk implements Cloneable{

    private String ssd;

    private String hhd;

    public Disk(String ssd, String hhd) {
        this.ssd = ssd;
        this.hhd = hhd;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getHhd() {
        return hhd;
    }

    public void setHhd(String hhd) {
        this.hhd = hhd;
    }

    @Override
    public Object clone() {
        try {
            return (Disk)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
