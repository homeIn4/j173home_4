package home0204.lishuaicarfactory;

/**
 * @author: 李帅
 * @user: Administrator
 * @description:
 * @date: Created in 11:25 2020/2/4
 * @version: 1.0
 * @modified By:
 */
public abstract class CarFactory {
    public abstract CarModel getCarModel(String engine,String struct,String wheel);
}
