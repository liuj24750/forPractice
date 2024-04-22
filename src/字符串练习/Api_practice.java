package 字符串练习;

public class Api_practice {
	public static void main(String []args) {
		//使用直接赋值的方式获取一个字符串对象
		String s1="abc";
		System.out.println(s1);
		
		//使用new的方式来获取一个字符串对象
		//空参构造，可以获取一个空白的字符串对象
		String s2=new String();
		System.out.println("@"+s2+"!");
		
		//传递一个字符串，根据传递的字符串内容
		//再创建一个新的字符串对象,属于是脱裤子放屁
		String s3=new String("abc");
		System.out.println(s3);
		
		//传递一个字符数组，根据字符数组的内容再创建
		//应用场景：我要修改字符串的内容。例如abc变成Qbc
		//abc-->{'a','b','c'}-->{'Q','b','c'}-->"Qbc",先将字符串变成
		//一个字符数组然后修改字符数组，然后使用这个构造方法
		//生成字符串
		char[] chs= {'a','d','s'};
		String s4=new String(chs);
		System.out.println(s4);
		
		//传递一个字符数组，根据字节数组的内容
		//再创建一个新的字符串对象
		//应用场景：以后在网络中传输的数据其实都是字节信息
		byte[] bytes= {97,98,99,100};
		String s5=new String(bytes);
		System.out.println(s5);
		
	}
	//api:应用程序编程接口
	//是别人已经写好的东西，我们不需要自己编写，直接使用即可
	//java api：指的是jdk中提供的各种功能的java类
	//这些类将底层的实现封装起来了，只需要学习这些类如何使用即可
}
