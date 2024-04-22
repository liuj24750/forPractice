package 面向对象练习;
import java.util.ArrayList;
public class Student02TestDemo {
	public static void main(String []args) {
		//创建一个集合，用来存储学生对象
		ArrayList<Student02>  list=new ArrayList<>();
		//创建3个学生对象
		Student02 stu1=new Student02("张三",23,"男");
		Student02 stu2=new Student02("李四",24,"女");
		Student02 stu3=new Student02("王五",25,"男");
		//把学生对象添加进集合
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		//调用工具类中的方法
		int maxAgeStudent = StudentUtil.getMaxAge(list);
		System.out.println(maxAgeStudent);
	}
}
