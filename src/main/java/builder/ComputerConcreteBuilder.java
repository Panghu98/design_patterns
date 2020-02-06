package builder;

/**
 * @author: panghu
 * @Description: Computer接口实现类ComputerConcreteBuilder，永固实现构造和装配该产品的各个组件
 * @Date: Created in 23:51 2020/2/4
 * @Modified By:
 */
public class ComputerConcreteBuilder implements ComputerBuilder {

    private Computer computer;

    public ComputerConcreteBuilder() {
        this.computer = new Computer();
    }

    public ComputerConcreteBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void buildcpu() {
        System.out.println("build cpu ----");
        computer.setCpu("8core");
    }

    @Override
    public void buildMemory() {
        System.out.println("build memory ---- ");
        computer.setMemory("16G");
    }

    @Override
    public void buildDisk() {
        System.out.println("build disk ----");
        computer.setDisk("1T");
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
