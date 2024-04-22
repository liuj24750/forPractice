package 抽象类练习;

public class Test {
	public static void main(String []args) {
		
		//创建对象
		Student s = new Student("zhangsan",23);
		
		//抽象类不能够实例化
		//Person p = new Person();
		
		System.out.println(s.getName()+","+s.getAge());	
	}
}
