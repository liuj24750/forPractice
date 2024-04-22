package HashMap练习;
import java.util.HashMap;
import java.util.Set;
public class HashMapDemo1 {
	public static void main(String []args) {
		
		//1.创建HashMap对象
		HashMap<Student,String> hm = new HashMap<>();
		
		//创建3个学生对象
		Student s1 = new Student("a",23);
		Student s2 = new Student("b",24);
		Student s3 = new Student("c",25);
		Student s4 = new Student("c",25);
		
		//添加元素
		hm.put(s1,"浙江");
		hm.put(s2,"江苏");
		hm.put(s3,"江西");
		
		//遍历集合
		//第一种遍历方式:根据key拿value
		Set<Student>  keys = hm.keySet();
		for(Student key : keys) {
			String value = hm.get(key);
			System.out.println(key+"="+value);
		}
		System.out.println("-----------------------------");
		
		//第三种遍历方式:lambda表达式
		hm.forEach((student,s) -> System.out.println(student+"="+s));
	}
}
