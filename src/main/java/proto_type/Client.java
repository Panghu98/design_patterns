package proto_type;

/**
 * @author: panghu
 * @Description: 原型模式测试类
 * @Date: Created in 23:08 2020/2/4
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        //浅复制
        Computer computer = new Computer("8core","16G","1TB");
        System.out.println("before simple clone:" + computer.toString());

        Computer computerClone = (Computer)computer.clone();
        System.err.println("after simple clone:" + computerClone.toString());

        //主线程休眠1秒。演示效果更好
        Thread.sleep(1000);
        System.out.println("==========================================================");

        //深复制
        Disk disk = new Disk("208G","2TB");
        ComputerDetail computerDetail = new ComputerDetail("12core","64G",disk);
        System.out.println("before deep clone:" + computerDetail.toString());

        ComputerDetail computerDetailClone = (ComputerDetail)computerDetail.clone();
        System.err.println("after deep clone:" + computerDetailClone.toString());
    }

}
