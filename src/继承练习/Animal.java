package 继承练习;

public class Animal {
	
	//java只支持单继承，不支持多继承，但支持多层继承（A子类继承父类B，父类B继承父类C）
	//每一个类都直接或者间接的继承于Object,一个类可以使用直接父类和间接父类里的内容
	
	//权限修饰符:
	//private:子类就无法访问了
	//私有:只能在本类(Animal)中访问
	
	//注意事项:
	//子类只能访问父类中非私有的成员
	public void eat() {
		System.out.println("吃东西");
	}
	public void drink() {
		System.out.println("喝水");
	}
}
