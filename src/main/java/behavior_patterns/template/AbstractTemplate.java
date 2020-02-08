package behavior_patterns.template;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 10:17 2020/2/8
 * @Modified By:
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法，用于核心流程和算法的定义
     */
    public void templateMethod() {
        checkNumber();
        queueUp();
        handleBusiness();
        serviceEvaluation();
    }

    /**
     * 抽号
     */
    private void checkNumber() {
        System.out.println("checkNumber .....");
    }

    /**
     * 排队
     */
    private void queueUp() {
        System.out.println("queueUp ....");
    }

    /**
     * 业务办理
     */
    public abstract void handleBusiness();

    /**
     * 服务评价
     */
    public void serviceEvaluation() {
        System.out.println("business finished,service evaluation ...");
    }


}
