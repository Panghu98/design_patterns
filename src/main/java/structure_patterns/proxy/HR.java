package structure_patterns.proxy;

/**
 * @author: panghu
 * @Description: Company的实现类
 * @Date: Created in 23:10 2020/2/6
 * @Modified By:
 */
public class HR implements Company {
    @Override
    public void findWorkers(String title) {
        System.out.println("I need to find a worker,title is: " + title);
    }
}
