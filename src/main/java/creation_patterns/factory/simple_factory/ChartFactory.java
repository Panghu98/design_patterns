package creation_patterns.factory.simple_factory;


/**
 * 图表工厂类：工厂类
 *
 * @author panghu
 */
public class ChartFactory {

    /**
     * 静态工厂方法
     * @param type 图表类的类型
     * @return 图表类实例
     */
    public static Chart getChart(String type){
        Chart chart=null;
        if(type.equalsIgnoreCase("histogram")){
            chart=new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }
        else if(type.equalsIgnoreCase("pie")){
            chart=new PieChart();
            System.out.println("初始化设置饼状图！");
        }

        return chart;
    }

}
