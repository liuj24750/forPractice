package HashMap练习;

public class Test {
	public static void main(String[] args) {
		FulTimeEmployee F1 = new FulTimeEmployee("Alice", 30, 5000);
		System.out.println("Full Time Employee Salary: " + F1.calculateSalary());

		PartTimeEmployee P1 = new PartTimeEmployee("Bob", 25, 20);
		System.out.println("Part Time Employee Salary: " + P1.calculateSalary());

		TemporaryEmployee T1 = new TemporaryEmployee("Charlie", 35, 100);
		System.out.println("Temporary Employee Salary: " + T1.calculateSalary());

	}

}
