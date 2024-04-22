package 字符串练习;
import java.util.Scanner;
public class StringBuilderDemo03 {
	public static void main(String []args) {
		//链式编程
		//当我们在调用一个方法的时候，不需要用变量
		//接受他的结果，可以继续调用其他方法
		String a=getString().substring(1).replace("A","Q");
		//int len=getString().substring(1).replace("A","Q").length();
		//System.out.println(len);
		System.out.println(a);
	}
	public static String getString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str=sc.next();
		return str;
	}
}
