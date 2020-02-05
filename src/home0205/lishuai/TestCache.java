package home0205.lishuai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: 李帅
 * @user: Administrator
 * @description:
 * @date: Created in 16:45 2020/2/5
 * @version: 1.0
 * @modified By:
 */
public class TestCache {
    public static void main(String[] args) {
        /**
         * 在自己本地的springboot mybatis项目里跑通过没有问题，小组的
         * 项目里面没有配相关的jar包。
         */
       /* public  void testCache(){
            Map<String,List<Student>> map= new HashMap<>();
            List<Student> list= new ArrayList<>();
            List<Student> list2=null;
            Student student= new Student();
            student.setName("杨华1");
            student.setSex("男");
            student.setClassNo("56rs班");
            Student student2= new Student();
            student2.setName("杨华2");
            student2.setSex("女");
            student2.setClassNo("5sfgs班");
            list.add(student);
            list.add(student2);
            map.put("杨华",list);
            String item="杨华";
            Iterator<String> iterators = map.keySet().iterator();
            while (iterators.hasNext()){
                String ite=iterators.next();
                if (item.equals(ite)){
                    list2 = map.get(ite);
                    break;
                }
            }
            if (list2!=null){
                for (Student sb: list2
                ) {
                    System.out.println(sb.toString());
                }
                return;
            }


            QueryWrapper<Student> query= new QueryWrapper<>();
            query.eq("s_name",item);
            List<Student> list3 = mapper.selectList(query);
            for (Student s:list3
            ) {
                System.out.println(s.getName()+","+s.getSex()+","+s.getClassNo()+","+s.getGrade());
            }

        }*/
    }
}
