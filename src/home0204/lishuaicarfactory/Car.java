package home0204.lishuaicarfactory;

/**
 * @author: 李帅
 * @user: Administrator
 * @description:
 * @date: Created in 11:27 2020/2/4
 * @version: 1.0
 * @modified By:
 */
public class Car   extends CarModel  {
    private String engine;
    private String struct;
    private String wheel;

    public Car(String engine, String struct, String wheel) {
        this.engine = engine;
        this.struct = struct;
        this.wheel = wheel;
    }

    @Override
    public void getEngine() {
        System.out.println(engine);
    }

    @Override
    public void getStruct() {
        System.out.println(struct);
    }

    @Override
    public void getWheel() {
        System.out.println(wheel);
    }
}
