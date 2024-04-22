package 简单代码练习;

//键盘输入的练习
//import java.util.Scanner;
//public class test {
	//public static void main(String[] args){
		//创建对象，表示我现在准备要用scanner这个类
		//Scanner sc = new  Scanner(System.in);
		//接收数据,变量i记录了键盘录入的数据
		//System.out.println("请输入一个数字：");
		//int i = sc.nextInt();
		//System.out.println(i);	
	//}
//}
import java.util.Scanner;
public class test{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		//接受第一个数据
		int number1 = sc.nextInt();
		System.out.println("请输入第二个数据：");
		//接受第二个数据
		int number2 = sc.nextInt();
		//这样就写错了，不该有这个双引号
		//System.out.println("number1+number2");
		System.out.println("两个数据相加的结果是："+(number1+number2));
	}
}
