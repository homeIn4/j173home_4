package home0204.zhaolin;

public class Test {
    public static void main(String[] args) {
        CarFactory cf1 = new MercedesFactory();
        CarFactory cf2 = new BMWFactory();
        Car car1 = cf1.createCar();
        Car car2 = cf2.createCar();
        System.out.println("奔驰："+car1.getEngine()+","+car1.getFrame()+","+car1.getWheels());
        System.out.println("宝马："+car2.getEngine()+","+car2.getFrame()+","+car2.getWheels());
    }
}
