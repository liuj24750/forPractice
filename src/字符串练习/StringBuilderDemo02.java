package 字符串练习;

public class StringBuilderDemo02 {
	public static void main(String []args) {
		//创建对象
		StringBuilder sb=new StringBuilder();
		
		//添加字符串
//		sb.append("aaa");
//		sb.append("bbb");
//		sb.append("ccc");
//		sb.append("ddd");
		
		//这里可以将代码改成链式
		//因为实际上这里是StringBuilder对象
		sb.append("aaa").append("bbb").append("ccc").append("ddd");
		System.out.println(sb);
		
		//再把StringBuilder变回字符串
		String str=sb.toString();
		System.out.println(str);
	}
}
