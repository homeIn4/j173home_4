package home0204.lishuaicarfactory;

/**
 * @author: 李帅
 * @user: Administrator
 * @description:
 * @date: Created in 11:32 2020/2/4
 * @version: 1.0
 * @modified By:
 */
public class CarFactoryBulider extends CarFactory {
    @Override
    public CarModel getCarModel(String engine, String struct, String wheel) {
        Car car = new Car(engine, struct, wheel);
        return car;
    }
}
