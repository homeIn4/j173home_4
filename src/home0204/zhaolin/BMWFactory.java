package home0204.zhaolin;

public class BMWFactory extends CarFactory {
    @Override
    public Car createCar() {
        BMWCar bm = new BMWCar();
        bm.setEngine("宝马引擎");
        bm.setFrame("宝马车轮");
        bm.setWheels("宝马车架");
        return bm;
    }
}
