package 常见API练习;

import java.util.Objects;

//这个Cloneable接口里没有任何抽象方法
//如果一个接口里面没有抽象方法
//表示当前的接口是一个标记性接口
//现在Cloneable表示一旦实现了,那么当前类的对象就可以被克隆
public class Student implements Cloneable{
	private String name;
	private int age;
	public Student() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	/**
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//调用父类中的clone( )方法
		//相当于让Java帮我们克隆一个对象,并把克隆之后的对象返回出去
		return super.clone();
	}
	
}



