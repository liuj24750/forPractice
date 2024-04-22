package 字符串练习;
import java.util.Scanner;
public class Stringbuilder_practice01 {
	public static void main(String []args) {
		
		
//		使用StringBuilder的场景：
//		1.字符串的拼接
//		2.字符串的反转
		
		
//   键盘接受一个字符串，程序判断该字符串是否是对称字符串，并在控制台打印是或不是
//   对称字符串：123321
//	 非对称字符串：123123
	
//   思路：对称代表正着和反过来是一样的，也就是说把字符串倒过来和原来的进行比较
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入一个字符串:");
	String str=sc.next();
//  反转键盘录入的字符串
	StringBuilder sb=new StringBuilder();
	
//	把键盘录入的字符串放进StringBuilder
//	sb.append(str);
//	sb.reverse();
//	System.out.println(sb);
	
//  把上面的代码改写成链式代码写法
//	toString()它变回字符串
	String result = new StringBuilder().append(str).reverse().toString();
	
//  比较两个字符串
	if(str.equals(result)) {
		System.out.println("当前字符串是对称字符串");
	}else {
		System.out.println("当前字符串不是对称字符串");
	}
	}
}
