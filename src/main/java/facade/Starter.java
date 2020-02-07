package facade;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 18:20 2020/2/7
 * @Modified By:
 */
public class Starter {

    private DashBoard dashBoard;

    private Engine engine;

    private SelfCheck selfCheck;

    public Starter() {
        this.dashBoard = new DashBoard();
        this.engine = new Engine();
        this.selfCheck = new SelfCheck();
    }

    public void startup() {
        System.out.println("car engine startup");
        engine.startup();
        dashBoard.startup();
        selfCheck.startupCheck();
        System.out.println("car startup finished");
    }

    public void shutdown() {
        System.out.println("car engine shutdown");
        selfCheck.shutdownCheck();
        engine.shutdown();
        dashBoard.shutdown();
        System.out.println("car shutdown finished");
    }

}
