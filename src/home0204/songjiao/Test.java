package home0204.songjiao;

public class Test {

    public static void main(String[] args) {
//        Builder car=new BenzBuilder();
//        car.buildCar("奔驰","奔驰车轮","奔驰车架").getCar();
        Builder car=new BmwBuilder();
        car.buildCar("宝马","宝马车轮","宝马车架").getCar();
    }
}
