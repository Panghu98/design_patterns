package creation_patterns.builder;

/**
 * @author: panghu
 * @Description: ComputerDirector使用Builder接口实现产品的装配
 * +
 * @Date: Created in 10:57 2020/2/5
 * @Modified By:
 */
public class ComputerDirector {

    public Computer constructComputer(ComputerBuilder computerBuilder) {
        computerBuilder.buildMemory();
        computerBuilder.buildcpu();
        computerBuilder.buildDisk();

        return computerBuilder.buildComputer();
    }

}
