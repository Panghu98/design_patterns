package creation_patterns.factory.factory_method;

/**
 * @author: panghu
 * @Description: 工厂方法模式测试类方法
 * @Date: Created in 10:43 2020/2/3
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        //getBean()的返回类型为Object，需要进行强制类型转换
        factory = (LoggerFactory)XMLUtil.getBean();
        assert factory != null;
        logger = factory.createLogger();
        logger.writeLog();
    }

}
