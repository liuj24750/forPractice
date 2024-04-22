package 权限修饰符练习;

public class Fu {
	// final修饰方法表明该方法是最终方法，不能被重写
	//应用场景:当前方法是一种规则的时候,此规则不希望被别人改变，此时方法可以用final去修饰
	
	//final修饰类，表示是最终类,不能被继承
	
	//final修饰变量:叫做常量，只能被赋值一次
	public void show() {
		System.out.println("父类的show方法");
	}
}
