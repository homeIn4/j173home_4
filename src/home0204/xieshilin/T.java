package home0204.xieshilin;

/**
 * @Description : //描述
 * @Author : 谢世林
 * @Date: 2020-02-04 12:06
 */
public class T {

    public static void main(String[] args) {
        CarBuilder cb = new BMCarBuilder();
        String str =
        cb.builderCarBuilder("宝马引擎","宝马车轮","宝马车架").getCar();
        System.out.println(str);
        System.out.println();
        CarBuilder cb1 = new BMCarBuilder();
        String str1 =
                cb1.builderCarBuilder("奔驰引擎","奔驰车轮","奔驰车架").getCar();
        System.out.println(str1);
    }
}
