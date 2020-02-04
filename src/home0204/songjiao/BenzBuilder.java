package home0204.songjiao;

public class BenzBuilder extends  Builder {

    @Override
    public Car buildCar(String engine, String wheel, String carriage) {
       Car car=new MyCar(engine,wheel,carriage);
       return car;
    }
}


