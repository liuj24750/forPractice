package weekendTest;

public class FootballMan extends SportsMan {
	public FootballMan() {

	}

	public FootballMan(String name, int age, int salary) {
		super(name, age, salary);
	}

	@Override
	public void shoot() {
		System.out.println("足球运动员射门");
	}

	public void gaimao() {
		System.out.println("盖帽");
	}
}
