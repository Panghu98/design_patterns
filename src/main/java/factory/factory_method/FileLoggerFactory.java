package factory.factory_method;

/**
 * @author: panghu
 * @Description: 文件日志记录器工厂类：具体工厂
 * @Date: Created in 10:43 2020/2/3
 * @Modified By:
 */
public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        //创建文件，代码省略
        return new FileLogger();
    }

}
