package proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 23:12 2020/2/6
 * @Modified By:
 */
public class Proxy implements Company {

    private HR hr;

    public Proxy() {
        super();
        this.hr = new HR();
    }

    /**
     * 需要被代理的方法
     * @param title
     */
    @Override
    public void findWorkers(String title) {
        hr.findWorkers(title);
        //通过猎头寻找候选人

        String worker = getWorkers(title);
        System.out.println("Find a worker by proxy,worker name is " + worker);
    }

    private String getWorkers(String title) {
        Map<String,String> map = new HashMap<>(16);
        map.put("java","张三");
        map.put("php","李四");
        map.put("go","王五");

        return map.get(title);
    }
}
