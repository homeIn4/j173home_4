package home0204.yangchunlei;

public class CarRealModel extends CarModel{
    private String carName;
    private String power;
    private String level;
    private String body;

    @Override
    public void getCarName() {
        System.out.println(carName);
    }

    @Override
    public void getPower() {
        System.out.println(power);
    }

    @Override
    public void getLevel() {
        System.out.println(level);
    }

    @Override
    public void getBody() {
        System.out.println(body);
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
