package 简单代码练习;

public class PhoneTest {
	public static void main(String []args) {
		
		Phone p=new Phone();
		p.brand="小米";
		p.price=1999.99;
		System.out.println(p.brand);
		System.out.println(p.price);
		p.call();
		p.playGame();
		
		//对象代表什么，就得封装对应的数据并提供数据对应的行为
		String s="fbwkgfakdsfjdba";
		int len=s.length();
		System.out.println(len);
		
		String ss=s.toUpperCase();
		System.out.println(ss);
	}
}
