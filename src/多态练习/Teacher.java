package 多态练习;

public class Teacher extends Person{
	@Override
	public void show() {
	System.out.println("老师的信息为:"+getName()+","+getAge());
	}
}
