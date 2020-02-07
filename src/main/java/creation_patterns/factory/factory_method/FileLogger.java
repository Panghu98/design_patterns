package creation_patterns.factory.factory_method;

/**
 * @author: panghu
 * @Description: 文件日志记录器：具体产品
 * @Date: Created in 10:36 2020/2/3
 * @Modified By:
 */
public class FileLogger implements Logger{

    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }

}
