package home0204.yangchunlei;

public class CarRealBuilder extends CarBuilder{
    @Override
    public CarModel createCar(String carName, String power, String level, String body) {
        CarRealModel crm = new CarRealModel();
        crm.setCarName(carName);
        crm.setPower(power);
        crm.setLevel(level);
        crm.setBody(body);
        return crm;
    }

    public CarRealBuilder(String carName, String power, String level, String body){
        CarModel cm = this.createCar(carName, power, level, body);
        System.out.println(cm.getCarStructure());
    }
    public CarRealBuilder(String carName, String power, String level, String body,String other){
        CarModel cm  = this.createCar(carName, power, level, body);
        System.out.println(cm.getCarStructure());
    }
}
