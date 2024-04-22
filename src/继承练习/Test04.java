package 继承练习;

public class Test04 {
	public static void main(String[] args) {
		Manager m = new Manager("ogm001", "liujun", 15000, 8000);
		System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary() + "," + m.getBouns());
		m.work();
		m.eat();

		Cook c = new Cook();
		c.setId("ogm002");
		c.setName("zhangmeng");
		c.setSalary(8000);
		System.out.println(m.getId() + "," + m.getName() + "," + m.getSalary());
		c.work();
		c.eat();
	}
}
