package home0204.songjiao;

public abstract class Car {

    public abstract void getCarEngine();

    public  abstract void getCarWheel();

    public  abstract void  getCarCarriage();

    final public  void  getCar(){
        this.getCarEngine();
        this.getCarWheel();
        this.getCarCarriage();
    }
}
