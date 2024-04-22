package 多态练习;

class Cat extends Animal{
	String name="猫";
	@Override
	public void show() {
		System.out.println("Cat --- show()方法");
	}
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}