package factory.simple_factory;

/**
 * @author panghu
 */
public class Test {

    public static void main(String[] args){
        Chart chart;
        //读取配置文件中的参数
        String type = XMLUtil.getChartType();
        //创建产品对象
        assert type != null;
        chart = ChartFactory.getChart(type);
        chart.display();
    }

}
