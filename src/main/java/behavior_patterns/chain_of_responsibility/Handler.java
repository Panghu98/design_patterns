package behavior_patterns.chain_of_responsibility;

/**
 * @author: panghu
 * @Description: 该接口用于规定责任脸上各个环节的操作，这里定义了operator()，
 *                  用于在责任脸上各个环节处理任务时调用。
 * @Date: Created in 21:48 2020/2/8
 * @Modified By:
 */
public interface Handler {

    void operator();

}
