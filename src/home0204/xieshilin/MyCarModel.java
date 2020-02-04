package home0204.xieshilin;

/**
 * @Description : //描述
 * @Author : 谢世林
 * @Date: 2020-02-04 11:58
 */
public class MyCarModel extends CarModel {
    private String carEngine;
    private String carWheel;
    private String carFrame;

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine;
    }

    public void setCarWheel(String carWheel) {
        this.carWheel = carWheel;
    }

    public void setCarFrame(String carFrame) {
        this.carFrame = carFrame;
    }

    @Override
    public void getCarEngine() {
        System.out.println(carEngine );
    }

    @Override
    public void getCarWheel() {
        System.out.println(carWheel);
    }

    @Override
    public void getCarFrame() {
        System.out.println(carFrame);
    }
}
