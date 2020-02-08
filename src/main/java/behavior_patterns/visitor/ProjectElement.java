package behavior_patterns.visitor;

import java.util.Date;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:40 2020/2/8
 * @Modified By:
 */
public class ProjectElement implements Element {

    private String projectName;

    private String projectContent;

    private String visitorName;

    private Date visitorDate;

    public ProjectElement(String projectName, String projectContent) {
        this.projectName = projectName;
        this.projectContent = projectContent;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectContent() {
        return projectContent;
    }

    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public Date getVisitorDate() {
        return visitorDate;
    }

    public void setVisitorDate(Date visitorDate) {
        this.visitorDate = visitorDate;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void signature(String visitorName,Date visitorDate) {
        this.visitorDate = visitorDate;
        this.visitorName = visitorName;
    }

}
