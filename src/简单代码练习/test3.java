package 简单代码练习;
import java.util.Scanner;
//一个短路逻辑符的小练习
public class test3 {
	public static void main(String [ ] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		//接受第一个数据
		int a = sc.nextInt();
		System.out.println("请输入第二个数据：");
		//接受第二个数据
		int b = sc.nextInt();
		boolean result = a==6||b==6||(a+b)%6==0;
		System.out.println(result);
	}

}
