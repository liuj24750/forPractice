package 面向对象练习;
public class StudentTest {
	public static void main(String []args) {
		//创建第一个学生对象
		//static 就是静态
		//静态就是共享
		//所以哪些属性哪些方法需要共享，那就定义成static
		Student s1=new Student();
		s1.setName("张三");
		s1.setAge(23);
		s1.setGender("男");
		Student.teacherName = "阿玮老师";
		s1.study();
		s1.show();
		
		//创建第二个对象
		Student s2=new Student();
		s2.setName("李四");
		s2.setAge(24);
		s2.setGender("女");
		s2.study();
		s2.show();
	}
}
