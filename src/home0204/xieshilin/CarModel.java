package home0204.xieshilin;

/**
 * @Description : //描述
 * @Author : 谢世林
 * @Date: 2020-02-04 11:50
 */
public abstract class CarModel {
    //获得汽车引擎
    public abstract void getCarEngine();

    //获得汽车车轮
    public abstract void getCarWheel();

    //获得汽车车架
    public abstract void getCarFrame();

    //得到汽车
    final public String getCar() {
        this.getCarEngine();
        this.getCarWheel();
        this.getCarFrame();
        return "得到汽车";
    }


}
