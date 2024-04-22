package 权限修饰符练习;

public class Animal {
	private String name;
	/*
	 * private这种情况下,想要使用name, 需要name提供一个公共的get方法,外面才能用
	 */
	
	public void show() {
		//private同一个类中可以调用
		System.out.println(name);
	}
}

//权限修饰符的使用规则
//实际开发中,一般只用private和public(最小和最大)
//1.成员变量私有 2.方法公开
//特例:如果方法中的代码是抽取其他方法中的共性代码,这个方法一般也私有

//静态代码块
//格式:static{ }
//需要通过static关键字修饰,随着类的加载而加载,并且自动触发,只执行一次
//使用场景:在类加载的时候,做一些数据初始化的时候使用
