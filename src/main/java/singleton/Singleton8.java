package singleton;

/**
 * @author: panghu
 * @Description: Initialization Demand Holder (IoDH) 实现饿汉模式的延迟加载和占用内存的问题
 * @Date: Created in 21:56 2020/2/4
 * @Modified By:
 */
@ThreadSafe
public class Singleton8 {

    private Singleton8() {
    }

    private static class HolderClass {
        private final static Singleton8 instance = new Singleton8();
    }

    public static Singleton8 getInstance() {
        return HolderClass.instance;
    }

    public static void main(String args[]) {
        Singleton8 s1, s2;
        s1 = Singleton8.getInstance();
        s2 = Singleton8.getInstance();
        System.out.println(s1==s2);
    }

}
