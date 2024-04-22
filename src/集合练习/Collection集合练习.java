package 集合练习;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Collection集合练习 {
	public static void main(String [ ]args) {
		
//		之前学习的ArrayList只是集合中的基础,只是java众多集合中的一种
		
//		集合体系结构
//		1.Collection 单列集合 在添加数据的时候每次只能添加一个元素  +脉动
//       常见成员方法:add,clear,remove,contains,isEmpty,size		
//		2.Map 双列集合 在添加数据的时候每次添加一对元素  +脉动  5元
		
//		单列集合最顶层的是Collection 然后可分为
//		1.List 又可分为ArrayList LinkedList和Vector   
//		2.Set 又可分为HashSet 和TreeSet,  而HashSet下面还有一个LinkedHashSet
//		要注意Collection List Set是接口,其他的都是实现类
		
//		List系列集合:添加的元素是有序 可重复 有索引的
//		Set系列集合:添加到元素是无序 不重复（可以利用这个特性进行数据的去重） 无索引的
		
//		Collection的遍历方式
//		1.迭代器遍历 最大的特点是它不依赖索引（它的独特之处在于可以在遍历的过程中删除元素）
//		迭代器在java中的类是Iterator,是集合专用的遍历方式
//		Collection获取迭代器 Iterator<E> iterator( )  返回迭代器对象,默认指向当前集合的0索引
//		boolean  hasNext( ) 判断当前位置是否有元素,有 true 无 false
//		E next( ) 获取当前位置的元素,并将迭代器对象移到下一个位置
		
		Collection<String> coll = new ArrayList<>();
		coll.add("aaa");
		coll.add("bbb");
		coll.add("ccc");
		coll.add("ddd");
		
//		获取迭代器对象,迭代器就像一个箭头,默认指向集合的0索引处
//		1.迭代器遍历完毕,指针不会复位
//		2.循环中只能用一次next方法
//		3.迭代器遍历时,不能用集合的方法进行增加或者删除
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
//		next方法的两件事:获取元素并移动指针
			String str = it.next();
			System.out.println(str);
		}

		
//		2.增强for循环 
//		之前的for循环在没有索引的时候（set）是无法使用的所以需要一个通用的遍历方式
//		增强for的底层就是迭代器,为了简化迭代器的代码书写的,所有的单列集合和数组才能用增强for遍历
		
//		增强for格式:
//			for(数据类型 变量名:集合/数组) {
//				
//			}
		
		Collection<String> coll1 = new ArrayList<>();
		coll1.add("zhangsan");
		coll1.add("lisi");
		coll1.add("wangwu");
		
//		s其实就是一个第三方变量,在循环的过程中依次表示集合里的每一个元素
		for(String s:coll1) {
//		修改增强for中的变量,不会改变集合中原本的数据
			System.out.println(s);
		}
		
		
//		3.Lamda表达式遍历
//		更简单 更直接的遍历集合方式 forEach 结合Lambda遍历集合
		
		Collection<String> coll2 = new ArrayList<>();
		coll2.add("zhangsan");
		coll2.add("lisi");
		coll2.add("wangwu");
		
//		利用Lambda遍历,但是这里先写匿名内部类的形式
//		这里创建的并不是接口的对象,而是后面这个没有名字的类的对象
//		这个没名字的类实现了前面的Consumer接口,重写了里面的抽象方法
		
		coll2.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
//		s依次表示集合中的每一个数据
				System.out.println(s);
			}
		});
		
//		Lambda表达式遍历 () -> {}
		coll2.forEach((String s)  -> {
//		s依次表示集合中的每一个数据
				System.out.println(s);
		});
		
	}
}
