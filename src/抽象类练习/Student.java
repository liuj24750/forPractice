package 抽象类练习;

public class Student extends Person{
	public Student() {
	}
	
	//将name和age传递过来,它是不是student里面赋值的吗？
	//并不是，它是通过super()关键字交给父类进行赋值的
	public Student(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void work() {
		System.out.println("学生的工作是学习");
	}
}
