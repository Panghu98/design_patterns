package builder;

/**
 * @author: panghu
 * @Description: 抽象接口ComputerBuilder,用于描述产品构造和装配过程；
 * @Date: Created in 23:49 2020/2/4
 * @Modified By:
 */
public interface ComputerBuilder {


    void buildcpu();

    void buildMemory();

    void  buildDisk();

    Computer buildComputer();
}
