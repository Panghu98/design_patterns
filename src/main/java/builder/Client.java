package builder;

/**
 * @author: panghu
 * @Description:  客户端类
 * @Date: Created in 11:09 2020/2/5
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerBuilder computerConcreteBuilder = new ComputerConcreteBuilder();
        Computer computer = computerDirector.constructComputer(computerConcreteBuilder);

        System.out.println(computer.getCpu());
        System.out.println(computer.getMemory());
        System.out.println(computer.getDisk());

    }

}
