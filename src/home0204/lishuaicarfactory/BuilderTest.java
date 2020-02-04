package home0204.lishuaicarfactory;

/**
 * @author: 李帅
 * @user: Administrator
 * @description:
 * @date: Created in 11:34 2020/2/4
 * @version: 1.0
 * @modified By:
 */
public class BuilderTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactoryBulider();
        String info = carFactory.getCarModel("宝马V6发动机", "升降式车架", "米其林453*4").getInfo();
        System.out.println(info);
        String info1 = carFactory.getCarModel("劳斯莱斯V12发动机", "794-防爆炸车架", "马牌特供").getInfo();
        System.out.println(info1);
    }
}
