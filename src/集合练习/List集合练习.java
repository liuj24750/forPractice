package 集合练习;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List集合练习 {
	public static void main(String [ ]args) {
		
//		Collection里面学习的相关方法和遍历方式,List里面同样能用
//		List的特点是有序 （存和取的顺序一样）有索引（可以通过索引操作元素） 可重复（存储的元素可以重复）
		
//		又因为List有索引所以多了很多索引操作的方法1.add(index,element) 2.remove(index) 3.set(index,element) 4.get(index)
		List<String> list = new ArrayList<>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
//		add(index,element) 原来索引上的元素会依次往后移动
		list.add(1,"qqq");
		
//		remove(index) 会返回被删除的元素
		String str = list.remove(0);
		System.out.println(str);
		
//		set(index,element) 返回被修改的元素
		String str1 = list.set(0, "QQQ");
		System.out.println(str1);
		
//		get(index) 返回指定索引处的元素
		String str2 = list.get(2);
		System.out.println(str2);
		
//		List集合独特的遍历方式 2种（除了它的父类Collection的3种以外的）
//		列表迭代器遍历
//		普通for循环
		
//		迭代器（在遍历时需要删除元素时，用它）
//		
//		增强for
//		
//		Lamda表达式
		
//		普通for循环
		
//		列表迭代器（额外添加了一个方法，可以添加列表元素 add）（在遍历时需要添加元素时，用它）
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()) {
			String str3=it.next();
			if("bbb".equals(str3)) {
				it.add("xxx");
			}
		}
		System.out.println(list);
	}
}
