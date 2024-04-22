package 常见API练习;
import java.util.Scanner;

public class 包装类改写键盘录入 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String line = sc.nextLine();
		System.out.println(line);
		double v=Double.parseDouble(line);
		System.out.println(v+1);
	}
}
