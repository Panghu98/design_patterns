package structure_patterns.flyweight;

/**
 * @author: panghu
 * @Description: 客户端类
 * @Date: Created in 22:11 2020/2/7
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //首次获取内存，将创建一个内存
        Memory memory = MemoryFactory.getMemory(32);
        //在使用之后释放内存
        MemoryFactory.releaseMemory(memory.getId());
        //重新获取内存
        MemoryFactory.getMemory(32);

    }

}
