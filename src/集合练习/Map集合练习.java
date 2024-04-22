package 集合练习;

import java.util.HashMap;
import java.util.Map;

public class Map集合练习 {
	public static void main(String []args) {
		
//		键值对 键值对对象 Entry
//		双列集合因此需要存储一对数据，分别为键和值
//		键是不能重复的，值可以重复
//		键和值是一一对应的，每一个键只能找到自己对应的值
		
//		Map是双列集合的顶层接口，它的功能是全部双列集合都可以继承使用的
		
//		创建Map集合的对象
		Map<String,String> m = new HashMap<>();
		
//		添加元素put
//		put方法的细节，添加/覆盖
//		在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中
//		在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值返回
		m.put("guojin", "huanglong");
		m.put("weixiaobao","mujianpin");
		m.put("kenan", "xiaolan");
		
		//String value = m.put("weixiaobao","shuanger");
		//System.out.println(value);
		
		//删除remove
		//String result = m.remove("kenan");
		//System.out.println(result);
		
		//清空clear
		//m.clear();
		
		//判断键是否包含
		boolean keyResult = m.containsKey("guojin");
		System.out.println(keyResult);
		
		//判断值是否包含
		boolean valueResult = m.containsValue("xiaolan");
		System.out.println(valueResult);
		
		//是否为空
		boolean result = m.isEmpty();
		System.out.println(result);
		
		//size长度
		int size = m.size();
		System.out.println(size);
		
		System.out.println(m);
	}
}
