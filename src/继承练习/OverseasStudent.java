package 继承练习;
class OverseasStudent extends Person{
	
	//实际上这里是把父类里面的eat()和drink()重写了一遍
	//这就叫方法的重写，当父类的方法不能满足现在的需求时，需要进行方法的重写
	//书写格式，在继承体系里，子类出现了和父类一模一样的方法声明，我们就叫子类这个方法是重写的方法
	//@Override是放在重写后的方法上，校验子类重写时语法是否正确
	//以后重写方法时都加@Override注解，代码安全，优雅
	
	public void lunch() {
		this.eat();
		this.drink();
		
		super.eat();
		super.drink();
	}
	
	//应用场景，父类方法无法满足和子类需求时，重写方法，例如下面
	
	@Override
	public void eat() {
		System.out.println("吃意大利面");
	}
	@Override
	public void drink() {
		System.out.println("喝凉水");
	}
}