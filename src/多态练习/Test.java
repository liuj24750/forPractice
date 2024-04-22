package 多态练习;
public class Test {
	public static void main(String []args) {
		//创建三个对象，并调用register方法
		student s = new student();
		s.setName("张三");
		s.setAge(18);
		
		Teacher t = new Teacher();
		t.setName("王建国");
		t.setAge(30);
		
		Administrator admin = new Administrator();
		admin.setName("管理员");
		admin.setAge(35);
		
		register(s);
		register(t);
		register(admin);
		
	}
	
	//这个方法既能接受老师，又能接收学生，还能接受管理员
	//只能把参数写成这三个类型的父类
	public static void register(Person p) {
		p.show();
	}
}
