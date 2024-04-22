package 权限修饰符练习;

public class Test01 {
	public static void main(String []args) {
			
		// final修饰方法表明该方法是最终方法，不能被重写
		//应用场景:当前方法是一种规则的时候,此规则不希望被别人改变，此时方法可以用final去修饰
		
		//final修饰类，表示是最终类,不能被继承
		
		//final修饰变量:叫做常量，只能被赋值一次
		//final int a = 10;
		//System.out.println(a);//10
		//a = 20;此时无法赋值,已是常量
		//应用场景:圆周率等常量
		
		//其实这也解释了为什么字符串是不能发生变化的
		//final修饰引用数据类型,记录的地址值不能发生改变,内部的属性值还是可以改变的
		final Student s = new Student("zhangsan",23);
		//记录的地址值不能发生改变,内部的属性还是可以改变的
		///s=new Student();
		s.setName("lisu");
		s.setAge(24);
		System.out.println(s.getName()+","+s.getAge());
		
		//数组
		final int[]arr= {1,2,3,4,5};
		arr[0] = 10;
		arr[1] = 20;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
					}
	}
}
