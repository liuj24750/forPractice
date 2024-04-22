package 权限修饰符练习;
import 权限修饰符练习1.Teacher;
public class Test {
	public static void main(String []args) {
		
		//使用同一个包中的类时不需要导包
		/*
		 * Student s=new Student(); 
		 * s.setName("张三"); s.setAge(23);
		 * System.out.println(s.getName()+","+s.getAge());
		 */
		
		//使用java.lang包中的类时，不需要导包，
		//String就是java.lang包中的一个类
         String s="ogm";
         System.out.println(s);
         
         //用的是其他包里的类，需要导包
         Teacher t = new Teacher();
         
         //如果同时使用两个包中的同名类，需要用全类名
         
	}
}
