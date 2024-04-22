package 继承练习;

public class Test02 {
	public static void main(String []args) {
		Husky1 h = new Husky1();
		h.eat();
		h.drink();
		h.lookHome();
		h.breakHome();
		System.out.println("~~~~~~~~~~~");
		ChineseDog cd = new ChineseDog();
		cd.eat();
		cd.drink();
		cd.lookHome();
	}
}
