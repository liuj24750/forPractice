package 继承练习;

public class Employee {
	// 类名见名知意
	// 所有成员变量都需要私有
	// 构造方法(空参 带全部参数的构造)
	// get/set

	private String id;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// 工作
	public void work() {
		System.out.println("员工在工作");
	}

	public void eat() {
		System.out.println("吃米饭");
	}
}
