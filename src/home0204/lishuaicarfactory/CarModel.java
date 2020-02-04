package home0204.lishuaicarfactory;

/**
 * @author: 李帅
 * @user: Administrator
 * @description:
 * @date: Created in 11:26 2020/2/4
 * @version: 1.0
 * @modified By:
 */
public  abstract class CarModel {
      public  abstract void getEngine();
      public  abstract void getStruct();
      public  abstract void getWheel();
      public final  String getInfo(){
          getEngine();
          getStruct();
          getWheel();
          return "以上是信息";
      }


}
