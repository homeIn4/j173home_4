package home0205.yangchunlei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 模拟缓存
 */
public class TestMap {
    public static void main(String[] args) {
        // 数据库
        List<Map<String,User>> mapsDB = new ArrayList<>();
        // 缓存
        List<Map<String,User>> mapsReady = new ArrayList<>();
        boolean tag = false;
        for (int i = 0; i < 20; i ++){
            User user = new User("用户" + i,i);
            Map<String,User> map = new HashMap<>();
            map.put(i + "",user);
            if (i <10){
                mapsReady.add(map);
            }
            mapsDB.add(map);
        }
        System.out.println("缓存中数据条数:" + mapsReady.size());
        System.out.println("数据库中数据条数:" + mapsDB.size());
        // 查找年龄为X的用户
        String age = "15";
        for (Map map:mapsReady){
            if (map.get(age) != null){
                tag = true;
                System.out.println("在缓存中找到了年龄为" + age + "的用户");
            }
        }
        if (!tag){
            System.out.println("从缓存中没找到年龄为" + age + "的用户");
            System.out.println("准备从数据库中查找");
            for (Map map:mapsDB){
                if (map.get(age) != null){
                    System.out.println("在数据库中找到了年龄为" + age + "的用户");
                    mapsReady.add(map);
                }
            }
        }
        System.out.println("缓存中数据条数:" + mapsReady.size());
        System.out.println("数据库中数据条数:" + mapsDB.size());
        System.out.println("222");
    }
}
