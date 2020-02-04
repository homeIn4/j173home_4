package home0204.songjiao;

public class MyCar extends  Car{

    private  String carEngine;
    private  String carWheel;
    private  String carCarriage;

    public MyCar() {
    }

    public MyCar(String carEngine, String carWheel, String carCarriage) {
        this.carEngine = carEngine;
        this.carWheel = carWheel;
        this.carCarriage = carCarriage;
    }

    @Override
    public void getCarEngine() {
      System.out.println(this.carEngine);
    }

    @Override
    public void getCarWheel() {
        System.out.println(this.carWheel);
    }

    @Override
    public void getCarCarriage() {
        System.out.println(this.carCarriage);
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public void setCarWheel(String carWheel) {
        this.carWheel = carWheel;
    }

    public void setCarCarriage(String carCarriage) {
        this.carCarriage = carCarriage;
    }
}
