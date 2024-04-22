package 集合练习;

import java.util.HashMap;
import java.util.Map;

public class Map遍历方式练习 {
	public static void main(String []args) {
		
//		Map的遍历方式
//		1.通过键去找值
//		2.以此获取每一个键值对的对象
//		3.lambda表达式
		
//		键找值
//		第一步：把所有的键都获取出来放在一个单列集合当中
//		第二步：遍历单列集合得到每一个键
//		第三步：通过get方法去依次获取每一个值
		
//		Map<String,String> m = new HashMap<>();
//		m.put("郭靖", "黄蓉");
//		m.put("韦小宝","双儿");
//		m.put("柯南", "小兰");
//		
//		Set<String> keys = m.keySet();
//		for(String key:keys) {
//			//System.out.println(key);
//			//利用map集合中的键获取对应的值 get
//			String value = m.get(key);
//			System.out.println(key+"="+value);
//			//结果是无序的
//		}
		
//		获取每一个键值对的对象，再用getKey( )和getValue( )获取键和值
		Map<String,String> m = new HashMap<>();
		m.put("A", "a");
		m.put("B", "b");
		m.put("C", "c");
		
		
//		通过键值对对象进行遍历
//		1.通过一个方法获取所有键值对对象，返回一个Set集合
//		(Set集合里面存储的是键值对对象，Set集合里面的泛型是entry<a,b>
//		同时entry<a,b>里面一样存在泛型，a是键，b是值，这里是一个泛型的嵌套)
//		Set<Entry<String, String>> entries = m.entrySet();
		
//		Set<Map.Entry<String,String>> entries = m.entrySet();
//		Entry是Map这个外部接口里的内部接口
		
//      2.遍历entries这个集合，去得到里面的每一个键值对对象
//		for(Entry<String, String> entry:entries) {
			
//		3.利用entry调用get方法获取键值对
//			String key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key+"="+value);
//		}
		
		
//		lambda表达式
//		底层：forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值，再调用accept方法
		m.forEach((String key,String value)->System.out.println(key+"="+value));
	}
}
