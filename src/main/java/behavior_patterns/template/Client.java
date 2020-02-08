package behavior_patterns.template;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 10:25 2020/2/8
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new TakeMonney();
        abstractTemplate.templateMethod();
        abstractTemplate = new SaveMonney();
        abstractTemplate.templateMethod();
    }

}
