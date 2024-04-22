package 集合练习;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class HashMap练习 {
	public static void main(String []args) {
		
//		HashMap是Map里面的一个实现类
//		没有额外需要学的特有方法，直接使用Map里面的方法就可以了
//		特点都是由键决定的：无序，不重复，无索引
		
//		HashMap底层原理是哈希表结构的
//		依赖hashCode方法和equals方法保证键的唯一
//		如果键存储的是自定义对象，需要重写hashCode和equals方法
//		如果值存储自定义对象，不需要重写hashCode和equals方法
		
//		需求:创建一个HashMap集合,键是学生对象（Student）值是籍贯（String）
//		存储三个键值对元素，并遍历
//		要求：同姓名，同年龄认为是同一个学生
//		核心点：如果HashMap中键存储的是自定义对象，需要重写hashCode和equals方法
		
//		需求:某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点
//		（A B C D）每个学生只能选择一个景点，请统计最终那个景点想去的人最多
//		思路：判断集合中是否包含该景点
//		1.不包含：表示第一次出现
//		2.包含：表示已经出现过了
		
//		需要先让同学们投票

//		定义一个数组，存储4个景点
		String [] arr= {"A","B","C","D"};
//		利用随机数模拟80个同学的投票，并把投票结果存储起来
		ArrayList<String> list=new ArrayList<>();
		Random r = new Random();
		for(int i = 0;i<80;i++) {
			int index = r.nextInt(arr.length);
			//System.out.println(arr[index]);
			list.add(arr[index]);
		}
//		上面可以理解为80个同学已经投完票了
		
//		如果要统计的东西比较多，不方便使用计数器思想
//		我们可以定义Map集合，利用集合进行统计
		
//		String代表的是景点  Integer代表的是投票的次数
		HashMap<String,Integer> hm=new HashMap<>( );
		
		for(String name : list) {
//			判断当前的景点在map集合中是否存在
			if(hm.containsKey(name)) {
//				存在
//				先获取当前景点已经被投票的次数
				int count = hm.get(name);
//				表示当前景点又被投了一次
				count++;
//				把新的次数再次添加到集合当中
				hm.put(name, count);
			}else {
//				不存在
				hm.put(name, 1);
			}	
		}
		System.out.println(hm);
		
//		求最大值
		int max = 0;
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
//			次数存在值当中
			int count = entry.getValue();
			if(count>max) {
				max = count;
			}
		}
		System.out.println(max);
		
//		判断哪个景点的次数和最大值一样，如果一样，打印出来
		for(Entry<String, Integer> entry : entrySet) {
//			次数存在值当中
			int count = entry.getValue();
			if(count==max) {
//				如果有相等，打印景点名
				System.out.println(entry.getKey());
			}
		}
	}
}
