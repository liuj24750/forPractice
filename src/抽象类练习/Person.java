package 抽象类练习;

public abstract class Person {
	
	//抽象方法，子类强制重写，否则报错
	//抽象方法所在的类就叫做抽象类
	//方法为抽象方法的时候,类也要写成抽象类
	public abstract void work();

	//抽象类不能实例化
	//抽象类中不一定有抽象方法,有抽象方法的类一定是抽象类
	//抽象类可以有构造方法
	private String name;
	private int age;
	
	//抽象类并不能实例化,为什么需要写构造方法呢？
	
	//作用:当创建子类对象的时候,给属性赋值的
	public Person() {
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
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
	
	//抽象类的子类
	//要么重写抽象类中所有抽象方法,要么是抽象类
}
