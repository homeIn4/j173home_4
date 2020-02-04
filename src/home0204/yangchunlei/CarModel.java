package home0204.yangchunlei;

/**
 * 汽车模型类
 */
public abstract class CarModel {
    // 车名
    public abstract void getCarName();
    // 发动机
    public abstract void getPower();
    // 车轮
    public abstract void getLevel();
    // 车架
    public abstract void getBody();
    final public String getCarStructure(){
        this.getCarName();
        this.getPower();
        this.getLevel();
        this.getBody();
        return "车模板组装完毕";
    }
}
