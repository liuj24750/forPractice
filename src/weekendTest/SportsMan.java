package weekendTest;

public class SportsMan {
	private String name;
	private int age;
	private int salary;
	
	public SportsMan() {
	}
	
	public SportsMan(String name,int age,int salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}
	
	//实际开发中是根据业务实现继承
	//提供接口,实装的时候根据参数不同,具体实现不同
	//例如:银行取钱,在美国拿美元,在日本取日元,取钱这个动作是接口,根据参数不同,具体实现不同

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void shoot() {
		System.out.println("运动员shoot");
	}
}
