package 字符串练习;
import java.util.StringJoiner;
//拼接速度快且代码简单的方法
public class Stringjoiner_practice {
	public static void main(String [] args) {
		//Stringjoiner跟StringBuilder一样，也可以看作是一个容器，创建之后里面的内容是可变的
		//jdk8出现的
		
//		String表示字符串的类，定义了很多操作字符串的方法
//		StringBuilder是一个可变的操作字符串的容器，可以高效的拼接字符串，还可以将容器里的内容反转
//		StringJoiner是jdk8出现的一个可变的操作字符串的容器，可以高效方便的拼接字符串
//		在拼接的时候可以指定间隔符号，开始符号，结束符号
		
		//Stringjoiner的构造方法
		//1.public StringJoiner(间隔符号)：创建一个StringJoiner对象，指定拼接时的间隔符号
		//2.public StringJoiner(间隔符号，开始符号，结束符号)：
		//创建一个StringJoiner对象，指定拼接时的间隔符号，开始符号，结束符号
		
		//Stringjoiner的成员方法
		//1.add 添加数据，并返回对象本身
		//2.length() 返回长度(字符出现的个数)
		//3.toString() 返回一个字符串(拼接之后的结果)
		
		//创建一个对象，并指定中间的间隔符号
//		StringJoiner sj = new StringJoiner("~~~");
		StringJoiner sj=new StringJoiner(",","(","}");//第一个是间隔符号，第二个是开始位置，第三个是结束位置
		
		//添加元素
		//到目前为止：只能添加字符串
//		sj.add("aaa").add("bbb").add("ccc");
		sj.add("aaa").add("bbb").add("ccc");
		
		int len = sj.length();
		System.out.println(len);//len表示的是字符个数
		
		String str = sj.toString();
		System.out.println(str);
		
//		System.out.println(sj);
		System.out.println(sj);
			
	}
}
