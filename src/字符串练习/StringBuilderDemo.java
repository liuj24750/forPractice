package 字符串练习;

public class StringBuilderDemo {
	public static void main(String []args) {
		//创建对象
		StringBuilder sb= new StringBuilder("abc");
		//添加元素
		sb.append(1);
		sb.append(2.3);
		sb.append(true);
		System.out.println(sb);
		//反转
		sb.reverse();
		System.out.println(sb);
		//获取长度
		int len=sb.length();
		System.out.println(len);
	}
}
