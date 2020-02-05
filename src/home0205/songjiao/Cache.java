package home0205.songjiao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache {
    public static void main(String[] args) {
        //模拟数据库
        Map<String,User> dbMap=new HashMap<>();
        //模拟缓存
        Map<String,User> cacheMap=new HashMap<>();

        User user1=new User();
        user1.setUserName("张三");
        user1.setAge(20);

        User user2=new User();
        user2.setUserName("王五");
        user2.setAge(18);

        User user3=new User();
        user3.setUserName("赵六");
        user3.setAge(19);

        User user4=new User();
        user4.setUserName("张柏");
        user4.setAge(20);

        dbMap.put("张三",user1);
        dbMap.put("王五",user2);
        dbMap.put("赵六",user3);
        dbMap.put("张柏",user4);

        cacheMap.put("张三",user1);
        cacheMap.put("张柏",user4);

        boolean b=true;

        //查询条件
        String userName="赵器";
        //先查询缓存中
        for (String str:cacheMap.keySet()){
            if (userName.equals(str)){
                System.out.println("缓存中找到名为:"+str+"/年龄:"+cacheMap.get(str).getAge()+"的人");
                b=false;
                return;
            }
        }

        if (b){
            for (String str:dbMap.keySet()){
                if (userName.equals(str)){
                    System.out.println("数据库中找到名为:"+str+"/年龄:"+dbMap.get(str).getAge()+"的人");
                    cacheMap.put(str,dbMap.get(str));
                    b=false;
                    return;
                }
            }
        }

        if (b){
            System.out.println("查无此人");
            cacheMap.put(userName,null);
        }
    }



}
