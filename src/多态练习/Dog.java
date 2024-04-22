package 多态练习;

class Dog extends Animal{
	String name = "狗";
	@Override
	public void show() {
		System.out.println("Dog --- show()方法");
	}
	public void lookHome() {
		System.out.println("狗看家");
	}
}