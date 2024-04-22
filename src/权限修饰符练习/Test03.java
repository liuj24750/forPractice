package 权限修饰符练习;

public class Test03 {
	public static void main(String [ ]args) { 
		
		//静态代码块
		//格式:static{ }
		//需要通过static关键字修饰,随着类的加载而加载,并且自动触发,只执行一次
		
		//使用场景:在类加载的时候,做一些数据初始化的时候使用
		//例如学生管理系统最开始时一些数据的初始化
		Student s = new Student();
		
		Student s1=new Student("zhangsan",23);
	
	}
}
