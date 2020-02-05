package home0204.zhaolin;

public class MercedesFactory extends CarFactory {
    @Override
    public Car createCar() {
        MercedesCar mc = new MercedesCar();
        mc.setEngine("奔驰引擎");
        mc.setFrame("奔驰车轮");
        mc.setWheels("奔驰车架");
        return mc;
    }
}
