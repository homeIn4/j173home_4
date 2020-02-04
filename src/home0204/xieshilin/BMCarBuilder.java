package home0204.xieshilin;

/**
 * @Description : //描述
 * @Author : 谢世林
 * @Date: 2020-02-04 12:04
 */
public class BMCarBuilder extends CarBuilder {
    @Override
    public CarModel builderCarBuilder(String carEngine, String carWheel, String carFrame) {
        MyCarModel cm = new MyCarModel();
        cm.setCarEngine(carEngine);
        cm.setCarWheel(carWheel);
        cm.setCarFrame(carFrame);
        return cm;
    }
}
