package 常见API练习;

public class 包装类 {
	public static void main(String []args) {
		
		//包装类:基本数据类型对应的引用类型
		//就是把基本数据类型变成了对象,也就是变成了引用数据类型
		//可以这么理解包装类,用一个对象,把基本数据类型给包起来了
		
		//为什么要使用包装类呢
		//在java中经常用到方法,由于多态的存在实际上万物皆继承于Object,如果是基本数据类型,数据是传不进来的
		//在集合当中是不能存储基本数据类型的
		
		//包装类中常用的主要是char--Character和int--Integer
		//在实际开发中,-128~127之间的数据,用的比较多
		//如果每次都是new对象,太浪费内存,所以把这个范围之内的每一个数据都创建好对象
		//如果要用到了不会创建新的,而是返回已经创建好的对象 
		
		//引进了一个新的机制:自动装箱和自动拆箱,在内部可以自动转化
		//自动装箱:把基本数据类型会自动变成其对应的包装类
		//自动拆箱:把包装类自动变成其对象的基本数据类型
		
		//所以现在获取包装类对象时
		//不需要new,不需要调用方法,直接赋值即可 Integer i = 10
		
		/*
		Integer成员方法
		1.String toBinaryString(int i) 得到二进制
		2.String toOctalString(int i) 得到八进制
		3.String toHexString(int i) 得到十六进制
		4.int parseInt(String s) 将字符串类型的整数转成int类型的整数
		*/
		String str1 = Integer.toBinaryString(100);
		System.out.println(str1);
		String str2 = Integer.toOctalString(100);
		System.out.println(str2);
		String str3 = Integer.toHexString(100);
		System.out.println(str3);
		
		//public static int parseInt(String s)  将字符串类型的整数转成int类型的整数
		//强类型语言:每种数据在java中都有各自的数据类型
		//在计算的时候,如果不是同一种数据类型,是无法直接计算的
		int i = Integer.parseInt("123");
		System.out.println(i);
		System.out.println(i+1);
		//8种包装类当中,除了character都有对应的parseXXX方法进行类型转换
		
	}
}
