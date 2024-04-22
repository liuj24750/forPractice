package 接口练习;

public class Frog extends Animal implements Swim {
	// 继承父类且实现一个接口
	// 此时需要重写里面所有的抽象方法

	public Frog() {

	}

	public Frog(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("青蛙在吃虫子");
	}

	@Override
	public void swim() {
		System.out.println("青蛙在蛙泳");
	}

}
