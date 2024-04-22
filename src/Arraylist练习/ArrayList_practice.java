package Arraylist练习;
import java.util.ArrayList;
public class ArrayList_practice {
	public static void main(String []args) {
		//创建集合的对象
		//泛型:限定集合中存储数据的类型,集合里面不能直接存储基本数据类型
		//可以写String，因为String是引用数据类型
		
		//ArrayList <String> list=new ArrayList<String>();
		//此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
		//这个类在底层做了一些处理
		//打印对象不是地址值，而是集合中存储数据内容
		//在展示的时候会拿[ ]把所有的数据进行包裹
		ArrayList<String> list=new ArrayList<>();
		System.out.println(list);
		/*
		 * 添加元素 list.add("aaa");
		 */
		/*
		 * boolean result=list.add("aaa");
		 * System.out.println(result);
		 * System.out.println(list);
		 */	
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list);
		
		//删除元素
		boolean result=list.remove("aaa");
		//删除成功的话会返回true
		System.out.println(result);
		System.out.println(list);
		//用索引这种方法删除时会返回被删除的元素
		String str=list.remove(1);
		System.out.println(str);
		
		//修改元素：会返回被覆盖的元素的值
		String newresult=list.set(0,"ddd");
		System.out.println(newresult);
		System.out.println(list);
		
		//查询元素
		String s=list.get(0);
		System.out.println(s);
		System.out.println(list);
		
		//获取长度int size( )
		int sum=list.size();
		System.out.println(sum);
		
		//获取集合长度和查询元素这两个方法一结合，就可以实现集合的遍历
		for(int i=0;i<list.size();i++) {
			String str1=list.get(i);
			System.out.println(str1);
		}
		 
		//想要往集合里面添加数据的时候，就需要用到ArrayList的成员方法
		//添加   boolean add(E e)
		//删除   boolean remove(E e)
		//          E remove(int index)
		//修改   E set(int index,E e)
		//查询   E get(int index)
		//获取长度 int size( )
		
	}
}
