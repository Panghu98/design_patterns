package creation_patterns.factory.factory_method;

/**
 * @author: panghu
 * @Description: 数据库日志记录器工厂类：具体工厂
 * @Date: Created in 10:42 2020/2/3
 * @Modified By:
 */
public class DatabaseLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        //初始化数据库日志记录器，代码省略
        return new DatabaseLogger();
    }

}
