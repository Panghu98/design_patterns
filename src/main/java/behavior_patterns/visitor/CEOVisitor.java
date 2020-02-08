package behavior_patterns.visitor;

import java.util.Date;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:49 2020/2/8
 * @Modified By:
 */
public class CEOVisitor implements  Visitor {
    @Override
    public void visit(ProjectElement element) {
        System.out.println("CEO Visitor Element ");
        element.signature("CEO",new Date());
        System.out.println(element.getProjectContent());
    }
}
