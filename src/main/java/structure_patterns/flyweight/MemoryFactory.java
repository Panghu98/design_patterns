package structure_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author: panghu
 * @Description: 内存工厂类
 * @Date: Created in 21:51 2020/2/7
 * @Modified By:
 */
public class MemoryFactory {

    /**
     * 内存对象列表，使用的内存块和未使用的内存块都有
     */
    private static List<Memory> memoryList = new ArrayList<>();

    public static Memory getMemory(int size) {
        Memory memory = null;
        for (int i = 0; i < memoryList.size(); i++) {

            memory = memoryList.get(i);

            //如果存在和需求size一眼大小并且未使用的内存块，则直接返回
            if (memory.getSize() == size && !memory.isIsused()) {
                memory.setIsused(true);
                //更新对象列表中当前元素的信息
                memoryList.set(i,memory);
                System.out.println("get memory from memoryList:"+memory);
                break;
            }

        }

        //如果内存不存在，则从系统中申请新的内存返回，并将该内存加入对象列表当中
        if (memory == null) {
            memory = new Memory(size,false, UUID.randomUUID().toString());
            System.out.println("create new memory form system and add to memoryList");
            memoryList.add(memory);
        }

        return memory;

    }

    /**
     * 释放内存
     */
    public static void releaseMemory(String id) {
        for (int i = 0; i < memoryList.size(); i++) {
            Memory memory = memoryList.get(i);
            //如果存在和需求size一样并且未使用的内存块，则直接返回
            if (memory.getId().equals(id)) {
                memory.setIsused(false);
                //更新对象列表中当前元素的信息 ？？？
                memoryList.set(i,memory);
                System.out.println("release memory:" + id);
                break;
            }
        }
    }

}
