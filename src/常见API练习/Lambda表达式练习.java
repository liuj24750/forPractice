package 常见API练习;

import java.util.Arrays;

public class Lambda表达式练习 {
	public static void main(String []args) {
		
//		可以简化匿名内部类的书写
		Integer [ ]arr = {2,3,1,5,6};
		
//		Arrays.sort(arr1,new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1,Integer o2) {
//				System.out.println("------------------------");
//				System.out.println("o1:"+o1);
//				System.out.println("o2:"+o2);
//				return o1 - o2;
//			}
//			});
		
//		new Comparator<Integer>() {
//			@Override
//			public int compare
//		到这里为止都可以不写
		
//		可以简化匿名内部类的书写		
//		在方法的形参和方法体中间,加上一个->
		Arrays.sort(arr,(Integer o1,Integer o2) ->{
				//System.out.println("------------------------");
				//System.out.println("o1:"+o1);
				//System.out.println("o2:"+o2);
				return o1 - o2;
			}
		);
		System.out.println(Arrays.toString(arr));
		
//       所以简化之后的代码到底是什么,正式开始学习Lambda表达式
//		 面向对象:先找对象,让对象做事情
		
//		 函数式编程是一种思想特点,实际上更重要的是并不是对象,哪个对象去做不重要,真正有用的是方法类的逻辑,
//		 也就是排序的规则之前受限于面向对象的语法规则,不得不创建Comparator的对象,函数式编程忽略面向对象
//		的复杂语法,强调做什么,而不是谁去做,更关注逻辑而不是创建出来的对象,要学习的Lambda表达式就是思想体现
		
//		Lambda表达式的标准格式(可结合上面的例子理解)
//		( ) ->{

//	    }
//      ( )   对应着方法的形参
//		->   是固定格式
//       {}   对应着方法的方法体		
	
//      注意:Lambda表达式可以用来简化匿名内部类的书写
//              Lambda表达式只能简化函数式接口的匿名内部类的写法
//       函数式接口:有且仅有一个抽象方法的接口叫做函数式接口,接口上方可以加@FunctionalInterface注解		
		
		
		//调用一个方法的时候,如果方法的形参是一个接口,那么我们要传递这个接口的实现类对象
		//如果实现类对象只要用到一次,就可以用匿名内部类的形式书写
		
		//匿名内部类的形式书写：
		//把这个对象传递给69行的形参,然后方法中用形参去调用形参方法swimming,真正调用的是上面重写的swimming方法
		method(new Swim() {
			@Override
			public void swimming() {
				System.out.println("正在游泳~~~");
			}
		});
		
		//利用Lambda表达式改写
		method(
				()->{System.out.println("正在游泳~~~");}
				);
	}
		public static void method(Swim s) {
			s.swimming( );
		}
	}	

@FunctionalInterface
		interface Swim{
			public abstract void swimming( );
		}

