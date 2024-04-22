package 多态练习;

public class Test01 {
	public static void main(String[] args) {
		// 创建对象(多态方式)
		// Fu f = new Zi();
		Animal a = new Dog();

		// 调用成员变量：编译看左边，运行也看左边
		// 编译看左边：javac编译代码的时候，会看左边的父类中有没有这个变量，如果有，编译成功，否则失败
		// 运行也看左边，java运行代码的时候，实际获取的就是左边父类中成员变量的值
		System.out.println(a.name);

		// 调用成员方法
		// 问题是这里的show()方法是运行哪一个，Animal还是Dog
		// 编译看左边，运行看右边
		// 编译看左边：javac编译代码的时候，会看左边的父类中有没有这个成员方法，如果有，编译成功，否则失败
		// 运行看右边：Java运行代码时，实际上运行的是子类的中的方法(右边)

		// 对于代码更深的理解
		// Animal a = new Dog();
		// 现在是用a去调用变量和方法的
		// 而a是Animal类型的，所以默认会从Animal这个类中去找

		// 成员变量:在子类的对象中，会把父类的成员变量也继承下来
		// 成员方法:如果子类对方法进行了重写，那么在虚方法表中是会把父类的方法进行覆盖的
		a.show();

		// 多态的弊端
		// 不能调用子类的特有功能,例如下面的lookHome方法
		// 原因是:当调用成员方法时编译看左边，运行看右边，
		// 在编译的时候会先检查左边的父类里面有没有这个方法，如果没有直接报错
		// a.lookHome();

		// 解决方案
		// 变回子类型就可以了
		// 细节:转换时不能瞎转，如果转成其他类的类型，就会报错
//		Dog b=(Dog)a;
//		b.lookHome();

		// 为了数据类型转换正确,转换前先做一个判断，关键字是instanceof
		// instanceof前面是变量名，后面是类名
//		if(a instanceof Dog) {
//			Dog b=(Dog) a;
//			b.lookHome();
//		}else if(a instanceof Cat) {
//			Cat c=(Cat) a;
//			c.catchMouse();
//		}else {
//			System.out.println("没有这个类型,无法转换");
//		}

		// 但是java有个新特性，先判断a是否为Dog类型,
		// 如果是则强转成Dog类型,转换之后变量名为d，如果不是，则不强转，结果直接是false
		if (a instanceof Dog b) {
			b.lookHome();
		} else if (a instanceof Cat c) {
			c.catchMouse();
		} else {
			System.out.println("没有这个类型,无法转换");
		}
	}
}
