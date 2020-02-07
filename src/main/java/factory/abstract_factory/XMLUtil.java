package factory.abstract_factory;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 21:26 2020/2/4
 * @Modified By:
 */
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtil {
    /**
     *     该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
     * @return
     */
    public static Object getBean() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/main/java/factory/abstract_factory/config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c=Class.forName("factory.abstract_factory."+cName);
            return c.newInstance();
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}