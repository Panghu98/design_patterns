package decorator;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 16:06 2020/2/6
 * @Modified By:
 */
public class Decorator implements Sourceable {

    private Sourceable source;


    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void createComputer() {
        source.createComputer();
        //在创建完电脑之后给电脑装上系统
        System.out.println("make system....");
    }
}
