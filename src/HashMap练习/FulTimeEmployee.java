package HashMap练习;

public class FulTimeEmployee implements Employee {

	private String name;
	private int age;
	private double salary;

	public FulTimeEmployee() {

	}

	public FulTimeEmployee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return name;
	}

	@Override
	public int getAge() {
		// TODO 自動生成されたメソッド・スタブ
		return age;
	}

	@Override
	public double getSalary() {
		// TODO 自動生成されたメソッド・スタブ
		return salary;
	}

	@Override
	public double calculateSalary() {
		// TODO 自動生成されたメソッド・スタブ
		return salary;
	}

}
