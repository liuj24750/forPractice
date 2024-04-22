package 常见API练习;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays练习 {
	public static void main(String []args) {
		
		//Arrays是操作数组的工具类
		
		/*
		常用方法
		1.toString( )  把数组拼接成一个字符串
		2.binarySearch( )  二分查找法查找元素
		3.copyOf( )  拷贝数组
		4.copyOfRange( )  拷贝数组(指定范围)
		5.fill( )  填充数组
		6.sort( )  按照默认方式进行数组排序
		7.sort( )  按照指定的规则排序
		*/
		int []arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		
		/*
		public static void sort(数组,排序规则)   按照指定的规则排序
		参数一:要排序的数组
		参数二:排序的规则
		细节:
			只能给引用数据类型的数组进行排序
			如果数组是基本数据类型,需要变成其对应的包装类
		*/
		Integer [ ]arr1 = {2,3,1,5,6};
		
		/*
		 * 第二个参数是一个接口,所以我们在调用方法的时候,要传递这个接口的实现类对象,作为排序的规则
		 * 但是这个实现类,只需要使用一次,所以没必要单独去写一个类,直接采取匿名内部类的方式就可以
		 */
		
		/*
		 * new的不是接口,而是后面这个没有名字的类的对象 
		 * 后面这个没有名字的类实现了Comparator这个接口, 
		 * 实现接口就要重写里面所有的抽象方法
		 * 所以要在这个没有名字的类当中重写接口里的抽象方法compare
		 */
		Arrays.sort(arr1,new Comparator<Integer>() {
			//接口后面有一个泛型,这个泛型要和数组里的数据类型保持一致
			@Override
			public int compare(Integer o1,Integer o2) {
				System.out.println("------------------------");
				System.out.println("o1:"+o1);
				System.out.println("o2:"+o2);
				return o1 - o2;
			}
			});
		System.out.println(Arrays.toString(arr));
	}
}
