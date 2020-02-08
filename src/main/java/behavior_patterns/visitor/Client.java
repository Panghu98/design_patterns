package behavior_patterns.visitor;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:52 2020/2/8
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Element element = new ProjectElement("mobike","share bicycle");
        element.accept(new CEOVisitor());
        element.accept(new CTOVisitor());

    }

}
