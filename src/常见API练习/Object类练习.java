package 常见API练习;

public class Object类练习 {
	public static void main(String []args) {
		
		//Object是java中的顶级父类,所有的类都直接或间接的继承于Object类
		//Object类中的所有的方法可以被所有子类访问,所以我们要学习Object类和其中的方法
		//Object的构造方法
		//它没有有参构造,只有空参构造,因为在java里面是没有一个属性是所有类的共性,而Object类是顶级父类
		
		//Object的成员方法
		//public String toString( ) 返回对象的字符串表示形式
		//public boolean equals(Object obj)   比较两个对象是否相等
		//public Object clone(int a)    对象克隆
		
		//toString( )方法的结论:
		//如果我们打印一个对象,想要看到属性值的话,那么就重写toString( )方法就可以了
		//在重写的方法中,把对象的属性进行拼接
		Object obj = new Object();
		String str1 = obj.toString();
		System.out.println(str1);//java.lang.Object@24d46ca6 这是对象的地址值
		System.out.println("----------------------------------");
		Student stu = new Student("liujun",25);
		String str2 = stu.toString();
		System.out.println(str2);
		System.out.println("----------------------------------");
		//这里可以打印出属性的原因是在student里面重写了toString( )方法
		//而println( )的源代码里面实际上调用了对象的toString( )方法
		System.out.println(stu);

		//System是java里的类
		//out是system里的静态变量
		//println()是这个对象里的方法
		//参数:表示打印的内容
		//用类名调用静态变量,out的类型是printstream这个类,所以System.out就可以获取到打印的对象
		//核心逻辑:
		//打印一个对象的时候,底层会调用对象的toString方法,把对象变成字符串,再打印在控制台上,打印完毕换行处理
		
		//思考:在默认情况下,因为Object类中的toString方法返回的是地址值
		//所以在默认情况下,打印一个对象打印的就是地址值
		//想要看到对象内部的属性值,该怎么办？
		//处理方案:重写父类
	}
}
