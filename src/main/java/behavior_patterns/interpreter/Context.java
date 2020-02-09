package behavior_patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 11:10 2020/2/9
 * @Modified By:
 */
public class Context {

    private Map<String, String> map = new HashMap<String, String>(16);

    public void assign(String key,String value) {
        //在环境类中设值
        map.put(key,value);
    }

    public String get(String key){
        //获取存储在环境类中的值
        return map.get(key);
    }



}
