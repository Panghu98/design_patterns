package behavior_patterns.template;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 10:23 2020/2/8
 * @Modified By:
 */
public class SaveMonney  extends AbstractTemplate{
    @Override
    public void handleBusiness() {
        System.out.println("save money from bank ....");
    }
}
