package 继承练习;
public class ShaPei extends Dog1{
	
	//eat()需要重写
	@Override
	public void eat() {
		super.eat();
		System.out.println("狗啃骨头");
	}
}
