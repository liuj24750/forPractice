package 简单代码练习;
/*
public class test1 {
	public static void main(String[] args) {
		System.out.println(3+2);
		System.out.println(5-1);
		System.out.println(7*9);
		System.out.println(100/5);
		//%运算符是取模也就是取余
		System.out.println(100%6);
	}
}
*/

/*小练习：数值拆分/需求：键盘录入一个三位数，
将其拆分为个位十位百位，并且打印在控制台*/
import java.util.Scanner;
public class test1{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入一个三位数：");
		int number = sc.nextInt();
		System.out.println("百位数是："+(number/100%10));
		System.out.println("十位数是："+(number/10%10));
		System.out.println("个位数是："+(number%10));
	}
}