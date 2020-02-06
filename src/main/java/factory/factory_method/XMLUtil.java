package factory.factory_method;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    /**
     * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
     * @return
     */
    public static Object getBean() {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/main/java/factory/factory_method/config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            //注意！！
            //Class.forName 需要通过全限定名获取
            Class c=Class.forName("factory.factory_method."+cName);
            return c.newInstance();
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
