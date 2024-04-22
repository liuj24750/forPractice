package weekendTest;

public class BasketballMan extends SportsMan {

	public BasketballMan() {
	}

	public BasketballMan(String name, int age, int salary) {
		super(name, age, salary);
	}

	@Override
	public void shoot() {
		System.out.println("篮球运动员投篮");
	}

	public void chanqiu() {
		System.out.println("铲球");
	}
}
