package behavior_patterns.visitor;

import java.util.Date;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:49 2020/2/8
 * @Modified By:
 */
public class CTOVisitor implements  Visitor {
    @Override
    public void visit(ProjectElement element) {
        System.out.println("CTO Visitor Element ");
        element.signature("CTO",new Date());
        System.out.println(element.getProjectContent());
    }
}
