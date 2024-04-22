package 接口练习;

public class Test {
	public static void main(String[] args) {
		// 接口就是一种规则,是对行为的抽象

		// 如何定义一个接口
		// 如何使用一个接口
		// 接口里面成员的特点

		Frog F = new Frog("小青", 1);
		System.out.println(F.getName() + ", " + F.getAge());
		F.eat();
		F.swim();

		// 提供接口,实装的时候根据参数不同,具体实现不同
		// 例如:银行取钱,在美国拿美元,在日本取日元,取钱这个动作是接口,根据参数不同,具体实现不同
	}
}
