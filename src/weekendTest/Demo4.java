package weekendTest;

public class Demo4 {
	public static void main(String[] args) {
		BasketballMan bm = new BasketballMan("liujun", 25, 10000);
		FootballMan fm = new FootballMan("zhangmeng", 25, 12000);
		System.out.println(bm.getName() + "," + bm.getAge() + "," + bm.getSalary());
		bm.shoot();
		bm.chanqiu();
		System.out.println(fm.getName() + "," + fm.getAge() + "," + fm.getSalary());
		fm.shoot();
		fm.gaimao();
	}
}
