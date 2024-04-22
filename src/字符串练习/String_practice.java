package 字符串练习;

public class String_practice {
	public static void main(String []args) {
		//创建两个字符串对象
		String s1=new String("abc");
		String s2="Abc";
		//==号比较
		//基本数据类型，比的是数据值
		//引用数据类型，比的是地址值
		System.out.println(s1==s2);
		
		//比较字符串对象中的内容是否相等(必须完全相等)
		boolean result1=s1.equals(s2);
		System.out.println(result1);
		
		//比较字符串对象中的内容是否相等，忽略大小写
		boolean result2=s1.equalsIgnoreCase(s2);
		System.out.println(result2);
		
		//结论：以后想要比较字符串里面的内容的话
		//就必须要用String里面的方法
				
	}
}
